package test.cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"})
public class RunCukesTest {
}