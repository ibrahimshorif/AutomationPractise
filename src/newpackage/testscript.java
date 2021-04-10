package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class testscript {

	public static void main(String[] args) throws  InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = base.getDriver();
		//navigating
		driver.get("http://www.selenium.dev/");
		
		/////click About menu
		driver.findElement(By.cssSelector("#navbar > div:nth-child(1) > span")).click();
		Thread.sleep(3000);
		////////click About option
		//WebElement About= driver.findElement(By.className("About"));
		
		driver.findElement(By.cssSelector("#aboutSubnav > div:nth-child(1) > a")).click();
		Thread.sleep(3000);
		//print header text 
		//String header_text = About.getText();
		//if(header_text.equals("About")) {
			
			//System.out.println("Selenium is a suite of tools for automating web browsers");
			
		//}else
		//{
			//System.out.println("blank");

		//}
		System.out.println("Selenium is a suite of tools for automating web browsers");

		//back home
		driver.navigate().back();
	}

}
