package words.game.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import words.game.util.WordFormatUtil;

@Service
public class WordsServiceImpl implements WordsService {
    @Override
    public String[] getWordsSequence(String[] words) {
        List<String> correctlyWords = new ArrayList<>();
        for (int i = 0; i < words.length && WordFormatUtil.isWord(words[i]); i++) {
            correctlyWords.add(words[i]);
            if (i != words.length - 1
                    && WordFormatUtil.isWord(words[i + 1])
                    && !WordFormatUtil.matchesWords(words[i], words[i + 1])) {
                break;
            }
        }
        return correctlyWords.toArray(String[]::new);
    }
}
