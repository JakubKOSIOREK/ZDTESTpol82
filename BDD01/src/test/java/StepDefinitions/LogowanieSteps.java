package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogowanieSteps {

    //krok 3 -> tworzymy pole driver
    WebDriver driver;

                                                                // krok 1 - kopiuję z wyniku testrunnar //
    @Given("Uzytkownik jest na stronie logowania")
    public void uzytkownik_jest_na_stronie_logowania() {
    /*
    jeżeli given jest takie samo jak w feature to wykonaj tę metodę
     */
                                                                // krok 2 -> instrukcje do wykonania //
        //System.out.println("Uzytkownik wszedl na strone logowania");

        // krok 4 -> dodajemy drivery do testow
        System.setProperty("webdriver.chrome.driver","c://chromedriver//chromedriver96.exe");
        driver = new ChromeDriver(); // konstruktor
        // otworzyło chroma
        driver.navigate().to("https://the-internet.herokuapp.com/login"); // adres testowanej strony logowania
    }

                                                                //krok 3 -> reszta krokow z logowanie.feature

    @When("Uzytkownik wprowadza w ple login poprawna wartosc")
    public void uzytkownik_wprowadza_w_ple_login_poprawna_wartosc() {
        driver.findElement(By.id("username")).sendKeys("tomsmith"); // okienko loginu na stronie, wprowadzamy dane tomsmith
    }

    @When("Uzytkownik wprowadza w pole password poprawne haslo")
    public void uzytkownik_wprowadza_w_pole_password_poprawne_haslo() {
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!"); // tu wyszukujemy po name
    }

    @When("Uzytkownik klika w przycisk Login")
    public void uzytkownik_klika_w_przycisk_login() {
        driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click(); //klikanie w guzik
    }

    @Then("Uzytkownik zostal poprawnie zalogowany do aplikacji")
    public void uzytkownik_zostal_poprawnie_zalogowany_do_aplikacji() {
        Assert.assertEquals("https://the-internet.herokuapp.com/secure", driver.getCurrentUrl()); // asercja -> sprawdzenie czy jestesmy na stronie
    }
}
