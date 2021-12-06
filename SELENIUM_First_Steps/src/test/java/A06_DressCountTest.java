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

public class A06_DressCountTest {

    /*
    przykładowy test mający na celu przetestowanie modyłu wyszukiwania poprzez wysłanie zapytania o konkretnej wartości
    do serwera i porównaniu odpowiedzi zawierającej wiele elementów z wartościa pytającą
     */
    private WebDriver driver;                                   // definiujemy zmienną driver jako zmienną prywatną
    String url = "http://automationpractice.com/index.php";     // adres strony
    WebElement searchInput;                                     // zmienna odnosząca się do Webelementu
    String searchToSend = "DRESS";                              // zmienna zawierająca wartość do wyszukania
    WebElement searchButton;                                    // zmienna odnosząca się do Webelementu
    WebElement searchTitle;                                     // zmienna odnosząca się do Webelementu
    List<WebElement> dresses;                                   // zmienna listy sukienek, ktore sie wyswietlą


    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver96.exe");
        driver = new ChromeDriver();
        /*
        w sekcji @BeforeTest tworzymy metodę public void setUp(), w której ciele będzie się znajdował kod do wykonania
        warunków wstępnych <preconditions> takich jak dodania webdriverów przeglądarki,
        System.setProperty("nazwa", "ścierzka do pliku"), na której będzie odbywał się test
        oraz konstruktor zmiennej driver = new < rodzaj webdriverów() > powiązany z webdriverami
        */
    }

    @Test
    /*
    celem tego testu jest sprawdzenie działania modyłu wyszukiwania poprzez podanie wartości string do serwera
    i porównania odpowiedzi z oczekiwanym rezultatem zawierającym wiele elementów z podaną wartością string
     */
    public void countDress(){                                           // metoda sprawdzająca proces wyszukiwania
        driver.get(url);                                                // driver otwierający stronę ze zmiennej url
        searchInput = driver.findElement(By.id("search_query_top"));    // konstruktor lokalizujący pole wyszukiwania
        searchInput.sendKeys(searchToSend);                  // wysłanie wartości ze zmiennej string
        searchButton = driver.findElement(By.name("submit_search"));    // konstruktor lokalizujący przycisk wyszukiwania
        searchButton.click();                                           // symulujemy kliknięcie przycisku


        WebDriverWait wait = new WebDriverWait(driver, 10);// zmienna wait do pauzy
        searchTitle = driver.findElement(By.xpath("//span[contains(text(),'7 results')]")); // konstruktor zmiennej wyniku wyszukiwania
        wait.until(ExpectedConditions.visibilityOf(searchTitle));
        /*
        tu tworzymy metodę pozwalająca na chwilowe zatrzymanie testu (pauzę) aby dać czas przeglądarce na pobranie
        i wyświetlenie informacji z serwera jako zmienną searchTitle dotyczących naszego zapytania ze zmiennej string
         */
        dresses = driver.findElements(By.xpath("//div[@class='product-image-container']"));
        // konstruktor wyszykujący liczbę elementów zawierających wartoość zmiennej pytającej
        System.out.println(dresses.size()); // wypisanie do konsoli wartość zapisaną w zmiennej dresses
        Assert.assertEquals(dresses.size(),7); // porównuje ilość wyświetlonych elementów

    }

    @AfterTest
    public void tearDown(){ driver.quit(); }
}
