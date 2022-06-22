package com.bdd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
features="src/test/resources/features",
glue="com.bdd.steps",
tags="@allAppFeatures",
plugin={"pretty", "html:target/reports/cucumber-reports.html", "json:target/reports/cucumber-reports.json"},
monochrome=true
)

public class TestRunner extends AbstractTestNGCucumberTests {

	TestNGCucumberRunner testNgCucumber= new TestNGCucumberRunner(this.getClass());
}
