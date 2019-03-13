package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "feature/TestCaseFile.feature",
glue = {"org.stepDefination"},
format = {"pretty","html:test-output"},
monochrome = true,
strict = true,
dryRun=true
)


public class TestRunner {

}

