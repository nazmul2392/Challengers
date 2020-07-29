package com.careerhack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions( 
		
		features = "Features",
		glue = "com.careerhack.stefdef"
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
