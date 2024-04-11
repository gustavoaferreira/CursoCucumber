package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/alugar_filme.feature",
		glue = "steps", 
		tags = "not @ignore",
		plugin = "pretty",
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		dryRun = false
		)
public class Runner {

}
