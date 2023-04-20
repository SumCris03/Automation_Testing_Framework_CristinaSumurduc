import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;


@RunWith(Cucumber.class)

//@RunWith( Cucumber.class)
@CucumberOptions(
  features = "src/main/java/features",
        glue = "stepDefinition",
        snippets = SnippetType.CAMELCASE,
        tags ={},
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class CucumberTestRunner {
    private abstract class Cucumber extends Runner {

    }
}