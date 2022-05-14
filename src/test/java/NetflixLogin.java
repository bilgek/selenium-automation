import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLogin {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/browse");

        WebElement username=driver.findElement(By.id("id_userLoginId"));
        username.sendKeys("example@example.com");

        WebElement password=driver.findElement(By.id("id_password"));
        password.sendKeys("12345");

        WebElement login = driver.findElement(By.xpath("//button[@data-uia='login-submit-button']"));
        login.click();







    }


}
