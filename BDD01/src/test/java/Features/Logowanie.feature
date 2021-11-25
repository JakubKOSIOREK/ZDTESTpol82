Feature:  Logowanie do systemu

  Jako uzytkownik chcę miec mozliwosc zalogowania się do systemu
  aby moc korzystac z zaawansowanych funkcji aplikacji

  Scenario: Poprawne logowanie do aplikacji
    Given Uzytkownik jest na stronie logowania

    When Uzytkownik wprowadza w ple login poprawna wartosc
    And Uzytkownik wprowadza w pole password poprawne haslo
    And Uzytkownik klika w przycisk Login

    Then Uzytkownik zostal poprawnie zalogowany do aplikacji