package seti2.test.authon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTask {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\deepanshusharma\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.navigate().to("https://autothon-nagarro-frontend-w03.azurewebsites.net/");  
		driver.manage().window().maximize(); 
		System.out.println("1");
		/////////////
		driver.findElement(By.name("Login")).click(); 
		driver.findElement(By.xpath("//*[@id=\"main\"]/span/div/div/ul/li[2]/div/div/div/input[1]")).sendKeys("user");
		driver.findElement(By.xpath("//*[@id=\"main\"]/span/div/div/ul/li[2]/div/div/div/input[2]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"main\"]/span/div/div/ul/li[2]/div/div/div/button")).click();
		String text = driver.findElement(By.xpath("//*[@id=\"navLink\"]")).getText();
		System.out.println(text);
	}
}
