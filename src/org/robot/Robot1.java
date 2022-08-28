package org.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot1 {
	public static void main(String[]args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kalaiselvi.j\\"
				+ "eclipse-workspace\\Actions\\src\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyPress(KeyEvent.VK_E);
	    r.keyRelease(KeyEvent.VK_E);
	    r.keyPress(KeyEvent.VK_L);
	    r.keyRelease(KeyEvent.VK_L);
	    r.keyPress(KeyEvent.VK_L);
	    r.keyRelease(KeyEvent.VK_L);	
	    Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_A);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_A);
	    Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_X);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_X);
	    
	}

}
