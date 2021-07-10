package words.game.util;

import org.junit.Assert;
import org.junit.Test;

public class ValidateUtilTest {
    @Test
    public void matchesEmptyWord_Ok() {
        Assert.assertFalse(ValidateUtil.isWord(""));
    }

    @Test
    public void matchesWordWithoutLetters_Ok() {
        Assert.assertFalse(ValidateUtil.isWord("1234"));
    }

    @Test
    public void matchesWordWithoutDash_Ok() {
        Assert.assertTrue(ValidateUtil.isWord("hello"));
    }

    @Test
    public void matchesWordWithDash_Ok() {
        Assert.assertTrue(ValidateUtil.isWord("Stand-up"));
    }
}
