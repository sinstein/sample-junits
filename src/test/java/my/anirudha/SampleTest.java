package my.anirudha;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Anirudha Khanna
 */
public class SampleTest {

    @Test
    public void testThatPasses() throws Exception {
        Assert.assertTrue("This should pass", true);
    }

    @Test
    public void anotherTestThatPasses() throws Exception {
        Assert.assertEquals("This should pass", 100, 100);
    }

    @Test
    public void testThatFails() throws Exception {
        Assert.assertFalse("This will always fail", true);
    }
}
