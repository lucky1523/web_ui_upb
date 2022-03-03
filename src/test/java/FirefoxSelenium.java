import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirefoxSelenium {
    WebDriver firefoxDriver;
    @BeforeEach
    public void openBrowser() throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","src/test/resources/driver/geckodriver.exe");
        firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://skynet.lp.upb.edu/~lpaniagua19/Proyecto/");
        firefoxDriver.manage().window().maximize();

        Thread.sleep(3000);

    }

    @Test
    public void goToFirefox() throws InterruptedException {
        firefoxDriver.findElement(By.xpath("/html/body/main/section[5]/section[1]/article[1]/div/h3/span/img")).click();
        Thread.sleep(1000);
        firefoxDriver.findElement(By.xpath("/html/body/main/section[5]/section[1]/article[2]/div/h3/span/img")).click();
        Thread.sleep(1000);
        firefoxDriver.findElement(By.xpath("/html/body/main/section[5]/section[1]/article[3]/div/h3/span/img")).click();
        Thread.sleep(1000);

        firefoxDriver.findElement(By.xpath("/html/body/footer/section[1]/form/div/input[1]")).sendKeys("luciano paniagua mallea");
        firefoxDriver.findElement(By.xpath("/html/body/footer/section[1]/form/div/input[2]")).sendKeys("upb_api@api.com");
        firefoxDriver.findElement(By.xpath("/html/body/footer/section[1]/form/div/input[3]")).sendKeys("12345dbrgb789");
        Thread.sleep(5000);
        firefoxDriver.findElement(By.xpath("/html/body/footer/section[1]/form/div/input[4]")).click();
        Thread.sleep(5000);
    }

    @AfterEach
    public void closeBrowser(){
        firefoxDriver.quit();
    }
}
