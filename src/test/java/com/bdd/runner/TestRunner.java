package com.bdd.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
features="src/test/resources/features",
glue="com.bdd.steps",
tags="@HomePageProductAndSellerDetailsCheck",
plugin={"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"},
monochrome=true
)

public class TestRunner extends AbstractTestNGCucumberTests {

	TestNGCucumberRunner testNgCucumber= new TestNGCucumberRunner(this.getClass());
}
