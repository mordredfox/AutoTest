package test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@MainPage",
        monochrome = true,
        features = "src/test/java/resources/"
)

public class Runtest {
}