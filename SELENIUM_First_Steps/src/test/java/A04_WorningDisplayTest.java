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

public class A04_WorningDisplayTest {
    /*
    przykładowy test mający na celu sprawdzenie, czy w razie wprowadzenia niepoprawnych danych wyskoczy okienko
    ostrzegawcze
    z odpowiednim komunikatem
     */

    private WebDriver driver;                       // definiujemy zmienną driver jako zmienną prywatną
    String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account"; // adres strony logowania
    String emailToSend = "poczta@poczta.pl";        // zmienna zawierająca adres email
    WebElement emailInput; // zmienna odnosząca się do Webelementu
    WebElement createAnAccountButton; // zmienna odnosząca się do Webelementu
    boolean warning; // zmienna boolean

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
    celem tego testu jest sprawdzenie, czy podczas próby założenia nowego konta poprzez podanie istniejącego już
    w bazie konta email do logowania aplikacja poinformuje nas o tym w postaci wyskakującego okienka z ostrzeżeniem
     */
    public void tryToRegister(){                                          // metoda sprawdzająca proces zakładania nowego konta
        driver.get(url);                                                  // driver otwierający stronę ze zmiennej url
        emailInput = driver.findElement(By.id("email_create"));           // konstruktor lokalizujący pole email w sekcji Create an accound
        emailInput.sendKeys(emailToSend);                      // metoda wpisująca dane ze zmiennej emailToSend
        createAnAccountButton = driver.findElement(By.id("SubmitCreate"));// konstruktor lokalizujący przycisk Create an accound
        createAnAccountButton.click();                                    // symulujemy kliknięcie przycisku

        /*
        po zasymulowaniu podania danych do utworzenia konta należy stworzyć tak zwane
        oczekiwanie warunkowe do momentu spełnienia warunku, w tym przypadku oczekiwanego okienka z ostrzeżeniem
        fakt ten jest spowodowany czasem odpowiedzi serwera na zapytanie wysłane po kliknięciu przycisku Create an accound
        poniewaź serwer musi przeszukać bazę danych czy już owych nie posiada w swoich zasobach
        */
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // metoda mająca za zadanie wstrzymanie akcji

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("create_account_error"))));
       // warunek oczekiwania na odpowiedź z serwera -> tu do momentu aż wyskoczy na stronie okienko

        // zmienna boolean
         warning = driver.findElement(By.id("create_account_error")).isDisplayed();
        Assert.assertTrue(warning);
        /*
        metodą Assert.assertTrue() dokonujemy sprawdzenia czy warunek został spełniony (True)
        czy otrzymaliśmy oczekiwany rezultat testu
        */
    }

    @AfterTest
    public void tearDown(){ driver.quit(); }
        /*
        w sekcji @AfterTest tworzymy metodę public void tearDown(), w której ciele będzie znajdował się kod do wykonania
        po zakończeniu sekcji @Test
        */
}
