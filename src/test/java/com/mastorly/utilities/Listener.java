package com.mastorly.utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mastorly.testcase.Student;

public class Listener extends ScreenCap implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {
			try {
				ScreenCap.screenCap(result.getClass().getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
