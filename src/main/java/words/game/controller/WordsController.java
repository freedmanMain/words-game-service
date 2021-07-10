package words.game.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import words.game.model.dto.WordsDto;
import words.game.service.WordsService;

@RestController
@RequestMapping("/words")
@AllArgsConstructor
public class WordsController {
    private final WordsService wordsService;

    @PostMapping
    public WordsDto getWords(@RequestBody WordsDto wordsDto) {
        String[] rightWords = wordsService.getWordsSequence(wordsDto.getWords());
        wordsDto.setWords(rightWords);
        return wordsDto;
    }
}
