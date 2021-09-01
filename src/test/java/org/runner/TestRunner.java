package org.runner;

import org.base.ReportGeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src//test//resources"},glue= {"org.stepdef"},tags= {"@reg"},monochrome=true,dryRun=true,snippets=SnippetType.CAMELCASE,
plugin= {"pretty","html:C:\\Users\\ELCOT\\Desktop\\eclipse\\CucuPro\\target","json:C:\\Users\\ELCOT\\Desktop\\eclipse\\CucuPro\\target\\R.json"
,"junit:C:\\Users\\ELCOT\\Desktop\\eclipse\\CucuPro\\target\\x.xml","json:C:\\\\Users\\\\ELCOT\\\\Desktop\\\\eclipse\\\\CucuPro\\\\target\\\\JVMReport\\\\Demo.json"})
public class TestRunner {
	
	@AfterClass
	public static void after() {
		ReportGeneration.report("C:\\Users\\ELCOT\\Desktop\\eclipse\\CucuPro\\target\\JVMReport\\Demo.json");
		

	}
	

}



