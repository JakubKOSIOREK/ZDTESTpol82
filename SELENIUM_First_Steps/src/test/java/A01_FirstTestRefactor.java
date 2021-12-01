import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A01_FirstTestRefactor {

    // zmienne
    private WebDriver driver;                                   // definiujemy zmienną driver jako zmienną prywatną
    String url = "http://automationpractice.com/index.php";     // zmienna zawierająca adres url strony do testu
    String expectedTitle = "My Store";                          // zmienna zawierająca wzorzec do porównania
    String pageTitle;                                           // zmienna do której zostanie zapisany tytuł strony


    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver96.exe");
        driver = new ChromeDriver(); // step 2 dajemy konstruktor zmiennej driver -> otwiera przeglądarkę
    /*
        w sekcji @BeforeTest tworzymy metodę public void setUp(), w której ciele będzie się znajdował kod do wykonania
        warunków wstępnych <preconditions> takich jak dodania webdriverów przeglądarki,
        System.setProperty("nazwa", "ścierzka do pliku"), na której będzie odbywał się test
        oraz konstruktor zmiennej driver = new < rodzaj webdriverów() > powiązany z webdriverami
     */
    }

    @Test
    public void checkPageTitle(){                     // metoda sprawdzająca tytuł strony
        driver.get(url);                              // driver otwierający stronę ze zmiennej url
        pageTitle = driver.getTitle();                // pobranie tytułu strony do zmiennej
        Assert.assertEquals(pageTitle, expectedTitle, "Tytuł strony się nie zgadza, sprawdź co poszło nie tak");
        /*
        metodą Assert.assertEquals(wartość pobrana , wzorzec , komunikat gdy błąd)
        dokonujemy sprawdzenia czy otrzymaliśmy rezultat oczekiwany testu
         */
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
        /*
        w sekcji @AfterTest tworzymy metodę public void tearDown(), w której ciele będzie znajdował się kod do wykonania
        po zakończeniu sekcji @Test
         */
    }
}
