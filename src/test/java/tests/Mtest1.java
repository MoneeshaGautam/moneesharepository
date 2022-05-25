package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Mtest1 {

	public static void main(String[] args) throws Exception
	{
		RemoteWebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		String x=driver.getTitle();
		System.out.println(x);
		//driver.close();
		driver.findElement(By.xpath("//div[text()='I agree']")).click();
		WebDriverManager.operadriver().setup();	
		 driver = new OperaDriver();
		//WebDriverManager.chromedriver().setup();
		driver.get("hppts://www.magnitia.com");
		Thread.sleep(2000);
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		driver.navigate().back();
		
		String x1=driver.getPageSource();
		System.out.println(x1);
		String y= driver.getCurrentUrl();
		System.out.println(y);
	}

}

