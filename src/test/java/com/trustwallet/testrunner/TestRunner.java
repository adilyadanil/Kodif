package com.trustwallet.testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Rerun failed tests from rerun.txt file

        features = {"src/test/resources/features/"},
        glue = {"com.trustwallet.stepDefinitions", "com.trustwallet.hooks"},
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/rerun.txt"  // Save Failed test scenarios in rerun.txt file
        }


        //,tags = "@smokeLogin"
)

public class TestRunner {
}
