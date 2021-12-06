import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;

public class A05_CustomerServiceTest {
    /*
    przykładowy test mający na celu sprawdzenie, modułu kontaktu z działem obsługi klienta mający za zadanie wysłąć
    informację w postaci tekstu oraz załącznika w formie pliku
     */
    private WebDriver driver;                              // definiujemy zmienną driver jako zmienną prywatną
    String url = "http://automationpractice.com/index.php";// adres strony
    WebElement contactUsButton;                            // zmienna odnosząca się do Webelementu
    WebElement emailInput;                                 // zmienna odnosząca się do Webelementu
    String emailToSend = "poczta@poczta.pl";               // zmienna zawierająca adres email
    WebElement fileInput;                                  // zmienna odnosząca się do Webelementu
    WebElement messageInput;                               // zmienna odnosząca się do Webelementu
    WebElement sendButton;                                 // zmienna odnosząca się do Webelementu
    boolean successMessage;                                // zmienna boolean
    Select subjectHeader;                                  // zmienna listy rozwijanej

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
    celem tego testu jest sprawdzenie, czy po naciśnięciu przycisku Contact us zostaniemy przekierowani do strony
    z formularzem kontaktowym i czy po wprowadzeniu poprawnego adresu email, dowolnego tekstu w polu wiadomości
    oraz dołączeniu pliku do wiadomości, formularz zostanie przesłany
     */
    public void sendMessage(){  // metoda sprawdzająca proces wysyłania formularza
        driver.get(url);        // driver otwierający stronę ze zmiennej url
        contactUsButton = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a"));
        // konstruktor lokalizujący przycisk Create an accound
        contactUsButton.click();    // symulujemy kliknięcie przycisku

        WebDriverWait wait = new WebDriverWait(driver, 10); // zmienna wait do pauzy
        emailInput = driver.findElement(By.id("email"));
        wait.until(ExpectedConditions.visibilityOf(emailInput));
        /*
        tu tworzymy metodę pozwalająca na chwilowe zatrzymanie testu (pauzę) aby dać czas przeglądarce na zmianę strony
        z głównej na formularz kontaktowy. Jako potwierdzenie wykorzystujemy znalezienie w formularzu pola do podania
        adresu email
         */



        //lista rozwijana
        subjectHeader = new Select(driver.findElement(By.id("id_contact")));
        subjectHeader.selectByVisibleText("Customer service");
        /*
        dla listy rozwijanej zawierającej kilka elementów tworzymy metodę, której zadaniem jest zlokalizowanie elementu
        zwanego listą rozwijaną oraz wybrania jednej z opcji wewnątrz listy
         */

        emailInput.sendKeys(emailToSend); // wpisujemy adres email ze zmiennej

        // dodawanie załącznika
        File file = new File("src/main/resources/tekst.txt");
        fileInput = driver.findElement(By.id("fileUpload"));
        fileInput.sendKeys(file.getAbsolutePath());
        /*
        załączanie pliku odbywa się poprzez konstruktor tworzący zmienną 'file' zawierającą ścierzkę do pliku,
        następnie lokalizujemy pole dodawania załączników i wysyłamy załącznik wykorzystując metodę
        get.AbsolutePath() odnosząca się do ścieżki ze zmiennej 'file'
         */

        // message
        messageInput = driver.findElement(By.id("message"));// konstruktor lokalizujący pole wiadomości w formularzu
        messageInput.sendKeys(("Ala ma kota"));             // wpisujemy dowolny ciąg znaków jako string

        // guzik send
        sendButton = driver.findElement(By.id("submitMessage"));// konstruktor lokalizujący przycisk wysyłania
        sendButton.click();                                     // metoda symulująca kliknięcie / naciścnięcie przycisku

        //potwierdzenie testu
        successMessage = driver.findElement(By.xpath("//p[@class='alert alert-success']")).isDisplayed();
        Assert.assertTrue(successMessage);
        /*
        do potwierdzenia wysłania widomości wykorzysujemy komunikat o poprawnym wysłaniu wiadomości poprzez
        zlokalizowanie go po xpath-u a do rozstrzygnięcia wyniku testu wykorzystujemy metodę Assert.assertTrue(boolen),
        której zadaniem jest odczytanie wartości true gdy komunikat zostanie wyświetlony
         */

    }

    @AfterTest
    public void tearDown(){ driver.quit(); }
    
}
