package com.mastorly.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.mastorly.testcase.Student;

public class ScreenCap extends Student {
	public static void screenCap(String name) throws IOException {
		TakesScreenshot shot = (TakesScreenshot) driver;
		File src = shot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Code_S_v2\\Be_Masterly\\ScreenCap" + name + ".png");
		FileHandler.copy(src, dest);
	}

	
}
