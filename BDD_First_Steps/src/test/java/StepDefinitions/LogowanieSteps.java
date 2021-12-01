package StepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogowanieSteps {

    static WebDriver driver;  // tworzymy pole driver jako zmienną web-ową

    @BeforeAll  // uruchomienie metod wspólnych dla wszystkich scenariuszy przed ich wykonaniem
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver96.exe"); // otwarcie okna przeglądarki
        driver = new ChromeDriver();    // konstruktor uruchamiający nowe okno przeglądarki
        /*
        do otwarcia okna wybranej przeglądarki niezbędne jest posiadanie sterowników danej przeglądarki, tak zwanych
        webdriver-ów, bardzo WAŻNE jest to aby posiadać wersję sterowników zgodną z wersją przeglądarki którą używamy
        do testowania aplikacji, setProperty("rodzaj webdriver-ów", "ścieżka do pliku <nazwa webdriver-a.exe>")
        */
    }

    // Scenario: Poprawne logowanie do aplikacji

    // GIVEN -> preconditions -> warunki wstępne które muszą być spełnione

    // @Given("nazwa") -> nazwa musi być TAKA SAMA jak w pliku Logowanie.feature
    @Given("Użytkownik jest na stronie logowania") // podłączenie źródła z pliku Logowanie.feature
        public void stronaLogowania(){             // metoda stronaLogowania dla warunku Given
        driver.navigate().to("https://the-internet.herokuapp.com/login");
        /*
        do otwarcia aplikacji w oknie przeglądarki wykorzystujemy webdrivera navigate().to()
        do którego wprowadzamy dokładny adres URL który ma zostać wyświetlony w oknie przeglądarki
         */
    }


    // WHEN -> steps to do -> kroki do wykonania w teście

    // @When("nazwa") -> nazwa musi być TAKA SAMA jak w pliku Logowanie.feature
    @When("Użytkownik wprowadza w pole LOGIN poprawny login") // podłączenie źródła z pliku Logowanie.feature,
    public void userLogin() {
        /*
        do zidentyfikowania pola w przeglądarce używamy metody findElement( ) w połączeniu z metodą By.X gdzie X oznacza
        sposób w jaki chcemy wyszukać np. po id < By.id() >, po nazwie pola < By.name() > lub po xPath-u < By.xpath() >
        */
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        /*
        pole LOGIN identyfikujemy po np. id pola znajdującym się w kodzie testowanej aplikacji
        < id="username" > następnie wysyłamy do tego pola poprawną wartość
        */
        }

    @And("Użytkownik wprowadza w pole PASSWORD poprawne hasło")
    public void userPassword(){
       driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        /*
        pole PASSWORD identyfikujemy po np. nazwie pola  znajdującym się w kodzie testowanej aplikacji
        < name="password" > następnie wysyłamy do tego pola poprawną wartość
        */
    }

    @And("Użytkownik wybiera przycisk LOGIN i naciska")
    public void loginPushbutton(){
        driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
        /*
        przycisk logowania identyfikujemy po np. xPath-u  skopiowanym z fragmentu kodu testowanej aplikacji
        a następnie symulujemy naciśnięcie przez kursor metodą click()
        */
    }

    // THEN -> rezultat oczekiwany

    @Then("Użytkownik został poprawnie zalogowany do aplikacji")
    public void correctLogin(){
        Assert.assertEquals("https://the-internet.herokuapp.com/secure" , driver.getCurrentUrl());
        /*
        do potwierdzenia poprawnego logowania do aplikacji wykorzystano obiekt Assert z funkcją porównania
        assertEquals() wewnątrz której umieszczamy wzorzec który zostanie porównany z wartością pobraną dzięki
        webdriver-owi driver.getCurrentUrl()
         */
    }


    // Scenario: Niepoprawne logowanie do aplikacji - dodatkowe pola

    @When("Użytkownik wprowadza w pole LOGIN niepoprawny login")
    public void badUserLogin(){
        driver.findElement(By.id("username")).sendKeys("johndoe");
    }
    @Then("Użytkownik nie został poprawnie zalogowany do aplikacji")
    public void incorrectLogin() {
        Assert.assertEquals("https://the-internet.herokuapp.com/login", driver.getCurrentUrl());
    }
    @And("Pojawił się komunikat o niepoprawnym loginie")
    public void incorrectLoginAlert() {
        Assert.assertEquals("Your username is invalid!\n" + "×", driver.findElement(By.id("flash")).getText());
    }

    // Poprawne / Niepoprawne logowanie do aplikacji z wykorzystaniem parametrów

    @Given("Użytkownik jest na stronie {string}") //naszym parametrem jest adres url podany w scenariuszu jako string
    public void stronaLogowania(String url) {
        driver.navigate().to(url);
    }
    @When("Użytkownik wprowadza w pole LOGIN {string}") //naszym parametrem jest userName podany w scenariuszu jako string
    public void username(String username) {
        driver.findElement(By.id("username")).sendKeys(username);
    }
    @When("Użytkownik wprowadza w pole PASSWORD {string}") //naszym parametrem jest password podany w scenariuszu jako string
    public void password(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    // Scenario: Niepoprawne logowanie do aplikacji z wykorzystaniem tabeli danych

    @When("Użytkownik wprowadza w pole LOGIN wartość (.+)$")
    public void usernameFromTabel(String username) {
        driver.findElement(By.id("username")).sendKeys((username));
    }
    @And("Użytkownik wprowadza w pole PASSWORD wartość (.+)$")
    public void passwordFromTabel(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @AfterAll
    public static void tearDown() { // uruchomienie metod wspólnych dla wszystkich scenariuszy po ich wykonaniu
        driver.quit();
    }
}
