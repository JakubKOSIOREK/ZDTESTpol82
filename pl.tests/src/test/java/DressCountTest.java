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

import java.util.List;

public class DressCountTest {

    private WebDriver driver;
    private String url = "http://automationpractice.com/index.php";
    private WebElement searchInput;
    private WebElement searchButton;
    private WebElement searchTitle;
    private List<WebElement> dresses; // to jest lista sukienek, ktore sie wyswietla


    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver96.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void countDress(){
        driver.get(url);
        searchInput = driver.findElement(By.id("search_query_top"));
        searchInput.sendKeys("DRESS");
        searchButton = driver.findElement(By.name("submit_search"));
        searchButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10); //oczekiwanie warunkowe do momentu spełnienia warunku
        searchTitle = driver.findElement(By.xpath("//span[contains(text(),'7 results')]"));
        wait.until(ExpectedConditions.visibilityOf(searchTitle));
        dresses = driver.findElements(By.xpath("//div[@class='product-image-container']")); // wyszykuje ile elementów się wyświetliło
        System.out.println(dresses.size());
        Assert.assertEquals(dresses.size(),7); // porównuje ilość wyświetlonych elementów

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}