package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;



public class ReportGeneration {

public static void report(String json) {
	File file =new File("C:\\Users\\ELCOT\\Desktop\\eclipse\\CucuPro\\target\\JVMReport");
net.masterthought.cucumber.Configuration config = new net.masterthought.cucumber.Configuration(file, "jvm");
config.addClassifications("Browser", "Chrome");
config.addClassifications("Url", "www.adactin.com");
config.addClassifications("Sprint", "1");
List<String> li = new ArrayList<String>();
li.add(json);
ReportBuilder build = new ReportBuilder(li, config);
build.generateReports();
}
}
 