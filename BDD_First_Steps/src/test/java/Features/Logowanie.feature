Feature: Logowanie do systemu

  Jako użytkownik chcę mieć możliwość zalogowania się do systemu
  aby móc korzystać z zawansowanych funkcji aplikacji.

  Scenario: Poprawne logowanie do aplikacji.

    Given Użytkownik jest na stronie logowania.

    When Użytkownik wprowadza w pole LOGIN poprawny login,
    And  Użytkownik wprowadza w pole PASSWORD poprawne hasło,
    And  Użytkownik wybiera przycisk LOGIN i naciska.

    Then Użytkownik został poprawnie zalogowany do aplikacji.