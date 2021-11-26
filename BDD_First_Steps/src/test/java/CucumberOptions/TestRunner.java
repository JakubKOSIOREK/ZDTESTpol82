package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)        // podłączenie biblioteki cucumber z pliku pom.xml

@CucumberOptions(               // podłączamy źródła dla klasy TestRunner

        features = "src/test/java/Features",    // ścieżka do katalogu zawierającego historyjki użytkownika
        glue = "StepDefinitions"                // ścieżka do katalogu zawierającego kroki Given->When->Then
)

public class TestRunner {
}
