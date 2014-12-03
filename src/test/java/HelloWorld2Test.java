import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by vladimirkr on 12/3/2014.
 */
public class HelloWorld2Test {
    @Test
    public void helloWorldTest() {
        Assert.assertTrue(true);
    }
    @Test
    public void helloWorld2Test() {
        Assert.assertTrue(false);
    }
}
