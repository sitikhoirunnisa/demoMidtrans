import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class midtransDemo {
    @Test
    public void firstTest () throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //waiter
//        WebDriverWait wait = new WebDriverWait(driver, 3);
//        WebElement elementUN = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));

        // Navigate to URL
        driver.get("https://demo.midtrans.com");

        // ELement locators
        WebElement buyBtn = driver.findElement(By.xpath("//*[contains(text(),'btn buy')]"));
       // WebElement name = driver.findElement(By.cssSelector("input[value='Budi']"));
       // WebElement email = driver.findElement(By.cssSelector("input[value='budi@utomo.com']"));
       // WebElement phone = driver.findElement(By.cssSelector("input[value='081808466410']"));
//        driver.findElement(By.id("user-name")).sendKeys("username1");
//        String strUsername = driver.findElement(By.id("user-name")).getAttribute("placeholder");
        String strText = "abcdefghijklmnopqrstuvwxyz1234567890";
//        WebElement elementBtnLogin = driver.findElement(By.id("login-button"));

        // Function / methods
        buyBtn.click();

        //cara 2
        .clear();
        name.sendKeys("Nisa");
        Thread.sleep(2000);

        email.clear();
        email.sendKeys("Nisa@mail.com");
        Thread.sleep(2000);

        phone.clear();
        phone.sendKeys("08123456789");
        Thread.sleep(2000);

        Assert.assertEquals(strText, "Name");
        Assert.assertEquals(strText, "Email");
        Assert.assertEquals(strText, "Phone");

        driver.quit();
    }
}
