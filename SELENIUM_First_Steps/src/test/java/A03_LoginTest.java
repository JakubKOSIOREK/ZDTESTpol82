import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A03_LoginTest {

    private WebDriver driver;                   // definiujemy zmienną driver jako zmienną prywatną
    String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account"; // adres strony logowania
    String emailToSend = "poczta@poczta.pl";    // zmienna zawierająca adres email
    String passwordToSend = "password";         // zmienna zawierająca hasło
    String title;                               // zmienna do której zostanie zapisany napis ze strony
    WebElement emailInput;                      // zmienna odnosząca się do pola email
    WebElement passwordInput;                   // zmienna odnosząca się do pola password
    WebElement singInButton;                    // zmienna odnosząca się do przycisku Sing In

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

    @Test                       // test dla isniejącego konta email
    public void doLogin(){                                          // metoda sprawdzająca proces logowania
        driver.get(url);                                            // driver otwierający stronę ze zmiennej url
        emailInput = driver.findElement(By.id("email"));            // konstruktor lokalizujący pole email w sekcji Sing In
        emailInput.sendKeys(emailToSend);                           // metoda wpisująca dane ze zmiennej emailToSend
        passwordInput = driver.findElement(By.id("passwd"));        // konstruktor lokalizujący pole password w sekcji Sing In
        passwordInput.sendKeys(passwordToSend);          // metoda wpisująca dane ze zmiennej passwordToSend
        singInButton = driver.findElement(By.id("SubmitLogin"));    // konstruktor lokalizujący przycisk Sing In
        singInButton.click();                                       // metoda symulująca kliknięcie / naciścnięcie przycisku
        title = driver.findElement(By.className("info-account")).getText(); // pobieramy napis ze strony do zmiennej title
        System.out.println(title);                                  // wyświetlenie pobranego napisu w konsoli
        Assert.assertEquals(title, "Welcome to your account. Here you can manage all of your personal information and orders.");
        /*
        metodą Assert.assertEquals(wartość pobrana , wzorzec , komunikat gdy błąd) dokonujemy sprawdzenia
        czy otrzymaliśmy oczekiwany rezultat testu
        */
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
        /*
        w sekcji @AfterTest tworzymy metodę public void tearDown(), w której ciele będzie znajdował się kod do wykonania
        po zakończeniu sekcji @Test
         */
}
