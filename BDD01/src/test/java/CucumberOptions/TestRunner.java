package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // trzeba dodać odnośnik do tego co w pom.xml

@CucumberOptions(           // trzeba dodać żródła do testrunnera
        features = "src/test/java/Features",
        glue = "StepDefinitions"
)
public class TestRunner {
}
