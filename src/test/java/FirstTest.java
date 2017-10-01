import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.bind.Element;

public class FirstTest {

    @Test
    public void loginToCustomerAccount() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost/litecart");
        WebElement UserEmail = driver.findElement(By.xpath("//input[@name='email']"));
        UserEmail.sendKeys("siedlov.vladyslav@gmail.com");
        WebElement UserPassword = driver.findElement(By.xpath("//input[@name='password']"));
        UserPassword.sendKeys("aaaa");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        assert (driver.findElement(By.xpath("//div[@class='alert alert-success']")).isDisplayed());
        driver.quit();
    }

}
