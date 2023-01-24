package com.qdpm.Reportsetup;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qdpm.ProFile.ProfileData;

public class ExtentSetup {

	public static ExtentReports setupreport() {
		
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String actualDate = format.format(date);
		//String reportpath = System.getProperty("user.dir")+"//reports//extent_"+actualDate+".html";
		String reportpath="E:\\QDPM\\reports\\extent.html";
		
		ExtentSparkReporter spark=new ExtentSparkReporter(reportpath);
		spark.config().setDocumentTitle("DocumentTitle");
		spark.config().setReportName("ExecutionReport");
		spark.config().setTheme(Theme.DARK);

		ExtentReports extent=new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Executed on Environment: ", ProfileData.getDataByKey("url"));
		extent.setSystemInfo("Executed on Browser: ", ProfileData.getDataByKey("browser"));
		extent.setSystemInfo("Executed on OS: ", System.getProperty("os.name"));
		extent.setSystemInfo("Executed by User: ", System.getProperty("user.name"));

		return extent;

	}

}
