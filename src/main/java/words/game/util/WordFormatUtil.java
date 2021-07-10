package words.game.util;

public class WordFormatUtil {
    private static final String WORD_FORMAT = "[a-zA-Z]+-?[a-zA-Z]+";

    public static boolean matchesWords(String previousWord, String nextWord) {
        return nextWord.charAt(0) == previousWord.charAt(previousWord.length() - 1);
    }

    public static boolean isWord(String word) {
        return word.matches(WORD_FORMAT);
    }
}
