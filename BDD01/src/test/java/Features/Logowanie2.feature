Feature: Logowanie do aplikacji

  opis funkcjonalności

  gdy chcemy przetestować dla np. kilku wartości username

  @now
  Scenario Outline: Niepoprawne logowanie do aplikacji
    Given Uzytkownik jest na stronie "https://the-internet.herokuapp.com/login"

    When Uzytkownik wprowadza w ple login wartosc <username>
    And Uzytkownik wprowadza w pole password wartosc <password>
    And Uzytkownik klika w przycisk Login

    Then Uzytkownik nie zostal poprawnie zalogowany do aplikacji
    And Pojawil sie komunikat o niepoprawnym zalogowaniu

    Examples: tabela z danymi do testowania
      | username | password             |
      | johndoe1 | SuperSecretPassword! |
      | janedoe  | SuperSecretPassword! |