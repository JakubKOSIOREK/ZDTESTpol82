Feature: Logowanie do systemu

  Jako użytkownik chcę mieć możliwość zalogowania się do systemu
  aby móc korzystać z zawansowanych funkcji aplikacji.

  @allTests @automationTest @correctTest
  Scenario: Poprawne logowanie do aplikacji
    Given   Użytkownik jest na stronie logowania
    When    Użytkownik wprowadza w pole LOGIN poprawny login
    And     Użytkownik wprowadza w pole PASSWORD poprawne hasło
    And     Użytkownik wybiera przycisk LOGIN i naciska
    Then    Użytkownik został poprawnie zalogowany do aplikacji

  @allTests @automationTest @incorrectTest
  Scenario: Niepoprawne logowanie do aplikacji
    Given   Użytkownik jest na stronie logowania
    When    Użytkownik wprowadza w pole LOGIN niepoprawny login
    And     Użytkownik wprowadza w pole PASSWORD poprawne hasło
    And     Użytkownik wybiera przycisk LOGIN i naciska
    Then    Użytkownik nie został poprawnie zalogowany do aplikacji
    And     Pojawił się komunikat o niepoprawnym loginie

  @allTests @manualTest @correctTest
  Scenario: Poprawne logowanie do aplikacji z wykorzystaniem parametrów
    Given   Użytkownik jest na stronie "https://the-internet.herokuapp.com/login"
    When    Użytkownik wprowadza w pole LOGIN "tomsmith"
    And     Użytkownik wprowadza w pole PASSWORD "SuperSecretPassword!"
    And     Użytkownik wybiera przycisk LOGIN i naciska
    Then    Użytkownik został poprawnie zalogowany do aplikacji

  @allTests @manualTest @incorrectTest
  Scenario: Niepoprawne logowanie do aplikacji z wykorzystaniem parametrów
    Given   Użytkownik jest na stronie "https://the-internet.herokuapp.com/login"
    When    Użytkownik wprowadza w pole LOGIN "johndoe"
    And     Użytkownik wprowadza w pole PASSWORD "SuperSecretPassword!"
    And     Użytkownik wybiera przycisk LOGIN i naciska
    Then    Użytkownik nie został poprawnie zalogowany do aplikacji
    And     Pojawił się komunikat o niepoprawnym loginie

  @allTests @loopTest @incorrectTest
  Scenario Outline: Niepoprawne logowanie do aplikacji z wykorzystaniem tabeli danych
    Given   Użytkownik jest na stronie "https://the-internet.herokuapp.com/login"
    When    Użytkownik wprowadza w pole LOGIN wartość <username>
    And     Użytkownik wprowadza w pole PASSWORD wartość <password>
    And     Użytkownik wybiera przycisk LOGIN i naciska
    Then    Użytkownik nie został poprawnie zalogowany do aplikacji
    And     Pojawił się komunikat o niepoprawnym loginie

    Examples: Tabela z danymi do testowania
      | username | password             |
      | johndoe  | SuperSecretPassword! |
      | janedoe  | SuperSecretPassword! |
