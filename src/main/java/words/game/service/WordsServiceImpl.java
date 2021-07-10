package words.game.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import words.game.util.ValidateUtil;

@Service
public class WordsServiceImpl implements WordsService {
    @Override
    public String[] getWordsSequence(String[] words) {
        List<String> rightWords = new ArrayList<>();
        for (int i = 0; i < words.length && ValidateUtil.isWord(words[i]); i++) {
            rightWords.add(words[i]);
            if (i != words.length - 1
                    && ValidateUtil.isWord(words[i + 1])
                    && !ValidateUtil.matchesWords(words[i], words[i + 1])) {
                break;
            }
        }
        return rightWords.toArray(String[]::new);
    }
}
