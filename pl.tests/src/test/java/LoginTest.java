import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    private WebDriver driver;
    String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account"; // adres strony logowania

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver96.exe");
        driver = new ChromeDriver();
    }

    @Test // test dla isniejącego konta
    public void doLogin(){
        driver.get(url);
        // zmienna odnosząca się do Webelementu -> pole email
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("poczta@poczta.pl"); // wprowadzamy login
        // zmienna odnosząca się do Webelementu -> pole password
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys("password"); // wwprowadzamy hasło
        // zmienna odnosząca się do Webelementu -> przycisk Sing In
        WebElement singInButton = driver.findElement(By.id("SubmitLogin"));
        singInButton.click(); // symulujemy kliknięcie przycisku
        String title = driver.findElement(By.className("info-account")).getText(); // pobieramy napis ze strony
        System.out.println(title); // wyświetlenie w konsoli napisu
        Assert.assertEquals(title, "Welcome to your account. Here you can manage all of your personal information and orders."); // sprawdzenie czy poprawnie zalogowało
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
