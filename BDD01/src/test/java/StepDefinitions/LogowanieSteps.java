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

    //krok 3 -> tworzymy pole driver
    static WebDriver driver; // gdy chcemy @BeforeAll to musimy zrobić static

    @BeforeAll // uruchamia metodę  dla wszystkich scenariuszy
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","c://chromedriver//chromedriver96.exe");
        driver = new ChromeDriver();

    }



    @Given("Uzytkownik jest na stronie logowania")
    public void uzytkownik_jest_na_stronie_logowania() {
        //System.setProperty("webdriver.chrome.driver","c://chromedriver//chromedriver96.exe"); // gdy BeforeAll to ty tego nie ma
        //driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/login");
    }

    @When("Uzytkownik wprowadza w ple login poprawna wartosc")
    public void uzytkownik_wprowadza_w_ple_login_poprawna_wartosc() {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
    }

    @And("Uzytkownik wprowadza w pole password poprawne haslo")
    public void uzytkownik_wprowadza_w_pole_password_poprawne_haslo() {
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
    }

    @And("Uzytkownik klika w przycisk Login")
    public void uzytkownik_klika_w_przycisk_login() {
        driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
    }

    @Then("Uzytkownik zostal poprawnie zalogowany do aplikacji")
    public void uzytkownik_zostal_poprawnie_zalogowany_do_aplikacji() {
        Assert.assertEquals("https://the-internet.herokuapp.com/secure", driver.getCurrentUrl());
        //driver.quit(); // gdy używamy BeforeAll to nie może być
    }

    @When("Uzutkownik wprowadza w pole login miepoprawna wartosc")
    public void uzutkownik_wprowadza_w_pole_login_miepoprawna_wartosc() {
        driver.findElement(By.id("username")).sendKeys("johndoe");
    }
    @Then("Uzytkownik nie zostal poprawnie zalogowany do aplikacji")
    public void uzytkownik_nie_zostal_poprawnie_zalogowany_do_aplikacji() {
        Assert.assertEquals("https://the-internet.herokuapp.com/login", driver.getCurrentUrl());
    }
    @And("Pojawil sie komunikat o niepoprawnym zalogowaniu")
    public void pojawil_sie_komunikat_o_niepoprawnym_zalogowaniu() {
        Assert.assertEquals("Your username is invalid!\n" + "×", driver.findElement(By.id("flash")).getText());
        //driver.quit();
    }

    // Uzytkownik jest na stronie "https://the-internet.herokuapp.com/login"
    @Given("Uzytkownik jest na stronie {string}")
    public void uzytkownik_jest_na_stronie(String URL) {
        //System.setProperty("webdriver.chrome.driver","c://chromedriver//chromedriver96.exe");
        //driver = new ChromeDriver(); // konstruktor -> startuje chrom
        driver.navigate().to(URL);
    }

    // Uzytkownik wprowadza w ple login "tomsmith"
    @When("Uzytkownik wprowadza w ple login {string}")
    public void uzytkownik_wprowadza_w_ple_login(String username) {
        driver.findElement(By.id("username")).sendKeys(username);
    }

    // Uzytkownik wprowadza w pole password "SuperSecretPassword!"
    @When("Uzytkownik wprowadza w pole password {string}")
    public void uzytkownik_wprowadza_w_pole_password(String password) {
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("Uzytkownik wprowadza w ple login wartosc (.+)$")
    public void uzytkownik_wprowadza_w_ple_login2(String username ) {
        driver.findElement(By.id("username")).sendKeys((username));
    }

    @And("^Uzytkownik wprowadza w pole password wartosc (.+)$")
    public void uzytkownik_wprowadza_w_pole_password2(String password){
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @AfterAll
    public static void tearDown(){ // do zamknięcia przeglądarki gdy BeforeAll
        driver.quit();
    }

}
