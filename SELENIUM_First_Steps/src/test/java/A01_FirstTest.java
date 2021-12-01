import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A01_FirstTest {
    public static void main(String[] args) {


        /*
        do otwarcia okna wybranej przeglądarki niezbędne jest posiadanie sterowników danej przeglądarki, tak zwanych
        webdriver-ów, bardzo WAŻNE jest to aby posiadać wersję sterowników zgodną z wersją przeglądarki którą używamy
        do testowania aplikacji
        */
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver96.exe"); // otwarcie przeglądarki
        WebDriver driver = new ChromeDriver();  // konstruktor uruchamiający nowe okno przeglądarki

        String url = "http://automationpractice.com/index.php"; // zmienna zawierająca adres url do sprawdzanej strony
        driver.get(url);    // wysyłanie zmiennej url i otwarcie strony w oknie przeglądarki

        String pageTitle;                   // zmienna pobierająca nazwę strony
        pageTitle = driver.getTitle();      // pobieranie nazwy strony i zapisanie w zmiennej pageTitle

        String expectedTitle = "My Store";  // zmienna zawierająca wynik oczekiwany
        Assert.assertEquals(pageTitle, expectedTitle, "Tytuł strony się nie zgadza, sprawdź co poszło nie tak");
        /*
        do potwierdzenia poprawnego logowania do aplikacji wykorzystano obiekt Assert z funkcją porównania
        assertEquals() wewnątrz której umieszczamy wzorzec który zostanie porównany z wartością pobraną oraz możemy
        dodatkowo dodać informację gdy test FAIL
         */

        driver.quit();  // zamknięcie okna przeglądarki


    }
}
