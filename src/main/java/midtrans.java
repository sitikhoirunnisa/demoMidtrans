import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class midtrans {
        @Test
        public void trans () throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://demo.midtrans.com/");

            WebElement buyBtn = driver.findElement(By.xpath("//a[@class='btn buy']"));
            WebElement user = driver.findElement(By.xpath("//input[@type=\"text\"]"));
            WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
            WebElement phone = driver.findElement(By.xpath("//input[@value=\"081808466410\"]"));

            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            StringBuilder sb = new StringBuilder();
            Random random = new Random();

            int length = 12;
            for (int i = 0; i < length; i++) {
                int value = random.nextInt(chars.length());
                char campur = chars.charAt(value);
                sb.append(campur);
            }
            String number = "1234567890";
            StringBuilder numb = new StringBuilder();
            Random numbRand = new Random();

            int jumlah = 2;
            for (int i = 0; i < 2; i++) {
               int all = numbRand.nextInt(number.length());
                char mix = number.charAt(all);
                numb.append(mix);
            }
            buyBtn.click();

            user.clear();
            user.sendKeys("Nisa");
            Thread.sleep(3000);

            email.clear();
            String randomStr = sb.toString();
            String randomStr2 = number.toString();
          email.sendKeys("Nisa@mail.com");
          Thread.sleep(3000);

            phone.clear();
            phone.sendKeys("189076");
            Thread.sleep(3000);

            driver.quit();

        }

}


