package org.cucu;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\DELL\\eclipse-workspace\\cucumber\\src\\test\\resources\\flipi.feature",
                        glue="org.cucu",
                        plugin= {"html:target","json:target/report.json"},
                        dryRun = false)

   

public class TestRunner {

}
