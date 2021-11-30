import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FirstTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver96.exe"); // step 1 podajemy sterownik do przeglądarki
        WebDriver driver = new ChromeDriver(); // step 2 dajemy konstruktor zmiennej driver -> otwiera przeglądarkę

        String pageTitle = "";  // step 3 zmienna do tytułu strony głównej
        String url = "http://automationpractice.com/index.php"; // step 4 adres url strony którą sprawdzamy
        String expectedTitle = "My Store"; // step 5 wartość ze strony url
        driver.get(url); // otwiera stronę
        pageTitle = driver.getTitle(); // pobiera tytuł strony

        Assert.assertEquals(pageTitle, expectedTitle, "Tytuł strony się nie zgadza, sprawdź co poszło nie tak");

        driver.quit(); // zamyka przeglądarkę
    }
}
