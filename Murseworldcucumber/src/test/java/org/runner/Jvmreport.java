package org.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

public class Jvmreport {
   public static void getJVMReport(String Jsonpath) {
	
	   File f = new File("Reports\\JVM Report");
	   
	   Configuration c = new Configuration(f, "Murseworld");
	   c.addClassifications("Application", "Murseworld");
	   c.addClassifications("Platform", "Chromebrowser");
	   c.addClassifications("Os", "windows 10");
	   
	   List<String> l = new ArrayList<String>();
	   l.add(Jsonpath);
	   
	   ReportBuilder r = new ReportBuilder(l, c);
	   Reportable r1 = r.generateReports();

}
}
