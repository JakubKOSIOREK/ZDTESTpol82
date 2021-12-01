import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class CustomerServiceTest {
    private WebDriver driver;
    private String url = "http://automationpractice.com/index.php";
    private WebElement contactUsButton;
    private WebElement emailInput;
    private Select subjectHeader; // zmienna listy rozwijanej
    private WebElement fileInput;
    private WebElement messageInput;
    private WebElement sendButton;
    private boolean successMessage;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver96.exe");
        driver = new ChromeDriver();
    }

    @Test // test dla isniejącego konta
    public void sendMessage(){
        driver.get(url);
        contactUsButton = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"));
        contactUsButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10); // zmienna wait do pauzy
        emailInput = driver.findElement(By.id("email"));
        wait.until(ExpectedConditions.visibilityOf(emailInput));
        //lista rozwijana
        subjectHeader = new Select(driver.findElement(By.id("id_contact")));
        subjectHeader.selectByVisibleText("Customer service");
        emailInput.sendKeys("poczta@poczta.pl");

        //załączanie pliku
        File file = new File("src/main/resources/tekst.txt");
        fileInput = driver.findElement(By.id("fileUpload"));
        fileInput.sendKeys(file.getAbsolutePath()); // wysyłanie pliku po pathname z konstruktora file

        // message
        messageInput = driver.findElement(By.id("message"));
        messageInput.sendKeys(("Ala ma kota"));

        // guzik send
        sendButton = driver.findElement(By.id("submitMessage"));
        sendButton.click();

        //potwierdzenie testu
        successMessage = driver.findElement(By.xpath("//p[@class='alert alert-success']")).isDisplayed();
        Assert.assertTrue(successMessage);

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
