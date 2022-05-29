package testcases;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleMainClass {

	public static void main(String[] args) throws Exception
	
	{
		RemoteWebDriver Driver;
		WebDriverManager.chromedriver().setup();
		Driver= new ChromeDriver();
		Driver.get("https://google.com");
		Thread.sleep(2000);
		Driver.close();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Site Url to open:");
		String x=sc.nextLine();
		if(x.equalsIgnoreCase("google"))
		{
			Driver.get("https://google.com");
		}
		else
		{
			Driver.get("https://google.co.in");
		}		
		//*Driver.gettitle();
		//Driver.get("sc");
		//Driver.close();
		//String x=Driver.getTitle();
		//Driver.get(x);
		//*


	}

	private static Object equalsIgnoreCase(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
