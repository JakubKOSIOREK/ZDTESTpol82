Feature:  Logowanie do systemu

  Jako uzytkownik chcę miec mozliwosc zalogowania się do systemu
  aby moc korzystac z zaawansowanych funkcji aplikacji


  @smokeTest @allTests
  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik jest na stronie logowania

    When Uzytkownik wprowadza w ple login poprawna wartosc
    And Uzytkownik wprowadza w pole password poprawne haslo
    And Uzytkownik klika w przycisk Login

    Then Uzytkownik zostal poprawnie zalogowany do aplikacji


  @smokeTest @allTests
  Scenario: Logowanie do aplikacji z niepoprwnymi danymi
    Given Uzytkownik jest na stronie logowania

    When Uzutkownik wprowadza w pole login miepoprawna wartosc
    And Uzytkownik wprowadza w pole password poprawne haslo
    And Uzytkownik klika w przycisk Login

    Then Uzytkownik nie zostal poprawnie zalogowany do aplikacji
    And Pojawil sie komunikat o niepoprawnym zalogowaniu

  @manualTest @allTests
  Scenario: Poprawne logowanie do aplikacji z wykorzystaniem parametrów
    Given Uzytkownik jest na stronie "https://the-internet.herokuapp.com/login"

    When Uzytkownik wprowadza w ple login "tomsmith"
    And Uzytkownik wprowadza w pole password "SuperSecretPassword!"
    And Uzytkownik klika w przycisk Login

    Then Uzytkownik zostal poprawnie zalogowany do aplikacji

  @manualTest @allTests
  Scenario: Niepoprawne logowanie do aplikacji z wykorzystaniem parametrów
    Given Uzytkownik jest na stronie "https://the-internet.herokuapp.com/login"

    When Uzytkownik wprowadza w ple login "johndoe"
    And Uzytkownik wprowadza w pole password "SuperSecretPassword!"
    And Uzytkownik klika w przycisk Login

    Then Uzytkownik nie zostal poprawnie zalogowany do aplikacji
    And Pojawil sie komunikat o niepoprawnym zalogowaniu
