package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\DELL\\eclipse-workspace\\Murseworldcucumber\\src\\test\\resources", 
glue="org.stepdefenition", dryRun=false, strict=true, snippets=SnippetType.CAMELCASE,
plugin= {"pretty","json:C:\\Users\\DELL\\eclipse-workspace\\Murseworldcucumber\\Reports\\Json Report\\gi.json"})
public class Runnnermurse {
@AfterClass
public static void tc1() {
	Jvmreport.getJVMReport("Reports\\Json Report\\gi.json");

}
}
