package com.mastorly.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mastorly.testcase.Student;

public class Listener extends ScreenCap implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
//			try {
//				//ScreenCap.screenCap(result.getClass().getName());
//				
//			//	public static void screenCap(String name) throws IOException {
//					TakesScreenshot shot = (TakesScreenshot) driver;
//					File src = shot.getScreenshotAs(OutputType.FILE);
//					File dest = new File("C:\\Code_S_v2\\Be_Masterly\\ScreenCap" + result.getTestName() + ".png");
//					FileHandler.copy(src, dest);
//				}
//			catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
