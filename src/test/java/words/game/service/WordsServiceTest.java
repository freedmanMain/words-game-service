package words.game.service;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class WordsServiceTest {
    private static WordsService wordsService;

    @BeforeClass
    public static void beforeClass() {
        wordsService = new WordsServiceImpl();
    }

    @Test
    public void sendVArrayWithAllCorrectlyWords_Ok() {
        String[] expected = {"fish", "horse", "east", "temp"};
        String[] actual = wordsService.getWordsSequence(new String[]{"fish", "horse", "east", "temp"});
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sendArrayWithOneCorrectWord_Ok() {
        String[] expected = {"fish"};
        String[] actual = wordsService.getWordsSequence(new String[]{"fish", "create", "each", "hello"});
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sendArrayWithTwoCorrectlyWords_Ok() {
        String[] expected = {"fish", "horse"};
        String[] actual = wordsService.getWordsSequence(new String[]{"fish", "horse", "stand-up", "hello"});
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sendArrayWithEmptyLines_Ok() {
        String[] expected = {"fish"};
        String[] actual = wordsService.getWordsSequence(new String[]{"fish", "", "horse", ""});
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sendEmptyArray_Ok() {
        String[] expected = {};
        String[] actual = wordsService.getWordsSequence(new String[]{});
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sendArrayWithEmptyFirstElement_Ok() {
        String[] expected = {};
        String[] actual = wordsService.getWordsSequence(new String[]{"", "empty"});
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void sendArrayWithoutWords_Ok() {
        String[] expected = {};
        String[] actual = wordsService.getWordsSequence(new String[]{"@", "1234", "ZX2scs@!"});
        Assert.assertArrayEquals(expected, actual);
    }
}
