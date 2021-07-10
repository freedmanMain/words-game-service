package words.game.util;

import org.junit.Assert;
import org.junit.Test;

public class WordFormatUtilTest {
    @Test
    public void matchesEmptyWord_Ok() {
        Assert.assertFalse(WordFormatUtil.isWord(""));
    }

    @Test
    public void matchesWordWithoutLetters_Ok() {
        Assert.assertFalse(WordFormatUtil.isWord("1234"));
    }

    @Test
    public void matchesWordWithoutDash_Ok() {
        Assert.assertTrue(WordFormatUtil.isWord("hello"));
    }

    @Test
    public void matchesWordWithDash_Ok() {
        Assert.assertTrue(WordFormatUtil.isWord("Stand-up"));
    }

    @Test
    public void matchesWordWithTwoDash_Ok() {
        Assert.assertFalse(WordFormatUtil.isWord("Stand--up"));
    }
}
