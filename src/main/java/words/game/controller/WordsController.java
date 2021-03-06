package words.game.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import words.game.model.dto.WordsRequestDto;
import words.game.model.dto.WordsResponseDto;
import words.game.service.WordsService;

@RestController
@RequestMapping("/words")
@AllArgsConstructor
public class WordsController {
    private final WordsService wordsService;

    @PostMapping
    public WordsResponseDto getWords(@RequestBody WordsRequestDto wordsRequestDto) {
        String[] correctlyWords = wordsService.getWordsSequence(wordsRequestDto.getWords());
        WordsResponseDto wordsResponseDto = new WordsResponseDto();
        wordsResponseDto.setWords(correctlyWords);
        return wordsResponseDto;
    }
}
