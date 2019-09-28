package seti2.test.authon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTask {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\deepanshusharma\\Desktop\\testautothon\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.navigate().to("https://autothon-nagarro-frontend-w03.azurewebsites.net/");  
		driver.manage().window().maximize(); 
		System.out.println("1");
		driver.findElement(By.name("Login")).click(); 
		System.out.println("3");
		driver.findElement(By.name("password")).click();
		System.out.println("2");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("password");
		driver.findElement(By.name("Cancel")).click();
		System.out.println("logout");
		//System.out.println();driver.findElement(By.className("navLink"));

	}
}
