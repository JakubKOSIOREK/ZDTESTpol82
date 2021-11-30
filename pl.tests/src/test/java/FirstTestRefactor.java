import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestRefactor {

    private WebDriver driver; // definiujemy zmienną driver
    String pageTitle = "";
    String url = "http://automationpractice.com/index.php"; // step 4 adres url strony którą sprawdzamy
    String expectedTitle = "My Store"; // step 5 wartość ze strony url

    @BeforeTest // wszystko co przed testem ma się wykonać
    public void setUp(){    // tworzymy metodę
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver96.exe"); // step 1 podajemy sterownik do przeglądarki
        driver = new ChromeDriver(); // step 2 dajemy konstruktor zmiennej driver -> otwiera przeglądarkę

    }

    @Test
    public void checkPageTitle(){ // metoda sprawdzająca tytuł strony
        driver.get(url);
        pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, expectedTitle, "Tytuł strony się nie zgadza, sprawdź co poszło nie tak");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
