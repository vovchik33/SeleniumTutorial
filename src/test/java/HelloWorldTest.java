import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by vladimirkr on 12/2/2014.
 */
public class HelloWorldTest {
    @Test
    public void loadTestThisWebsite() {
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://www.google.com");
//        System.out.println("Page Title is " + driver.getTitle());
//        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
//        Assert.assertEquals("Google", driver.getTitle());
//        driver.quit();
    }

    @Test
    public void helloWorldTest() {
        Assert.assertTrue(true);
    }
    @Test

    public void helloWorld2Test() {
        Assert.assertTrue(true);
    }
}
