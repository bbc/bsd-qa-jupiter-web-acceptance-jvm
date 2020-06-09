package uk.co.bbc.jupiter.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "junit:target/cucumber.xml"},
        features = "src/test/resources/uk.co.bbc.jupiter/features",
        glue = {"uk.co.bbc.jupiter.stepdefs"}
)
public class JupiterAppTest
{
}
