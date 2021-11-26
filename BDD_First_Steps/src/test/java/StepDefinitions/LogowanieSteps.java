package StepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogowanieSteps {

    WebDriver driver;                   // tworzymy pole driver jako zmienną web-ową

    // GIVEN -> preconditions

    @Given("Użytkownik jest na stronie logowania.")     // podłączenie źródła z pliku Logowanie.feature
                                                        // nazwa w cudzysłowie musi być TAKA SAMA jak w pliku Logowanie.feature

    public void stronaLogowania(){                      // metoda stronaLogowania dla warunku Given


        /* do otwarcia okna wybranej przeglądarki niezbędne jest posiadanie sterowników danej przeglądarki, tak zwanych
        webdriver-ów, bardzo WAŻNE jest to aby posiadać wersję sterowników zgodną z wersją przeglądarki którą używamy
        do testowania aplikacji */

        System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver96.exe"); // otwarcie okna przeglądarki
            // setProperty("rodzaj webdriver-ów"  , "dokładna ścierzka do pliku <nazwa>.exe");

        driver = new ChromeDriver();    // konstruktor uruchamiający nowe okno przeglądarki
        driver.navigate().to("https://the-internet.herokuapp.com/login");   // otwarcie aplikacji w oknie przeglądarki z adresu URL
    }
}
