package com.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature_files", 
								glue = "com.step", tags = "",
								dryRun = false)

public class TestRun {

}
