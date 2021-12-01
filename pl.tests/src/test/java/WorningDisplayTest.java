import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorningDisplayTest {

    private WebDriver driver;
    String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account"; // adres strony logowania
    private WebElement emailInput; // zmienna odnosząca się do Webelementu
    private WebElement createAnAccountButton; // zmienna odnosząca się do Webelementu
    private boolean warning; // zmienna boolean


    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver96.exe");
        driver = new ChromeDriver();
    }

    @Test // test tworzenia konta ale istnieje już email do logowania
    public void tryToRegister(){
        driver.get(url);
        emailInput = driver.findElement(By.id("email_create"));
        emailInput.sendKeys("poczta@poczta.pl"); // wprowadzamy login
        createAnAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAnAccountButton.click(); // symulujemy kliknięcie przycisku
        // oczekiwanie warunkowe do momentu spełnienia warunku
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("create_account_error"))));
        warning = driver.findElement(By.id("create_account_error")).isDisplayed();
        Assert.assertTrue(warning);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
