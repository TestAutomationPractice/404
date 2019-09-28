package seti2.test.authon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ThirdTask {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\deepanshusharma\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.navigate().to("https://autothon-nagarro-frontend-e03.azurewebsites.net/");  
		driver.manage().window().maximize(); 
		WebElement ele = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/button")));
		driver.findElement(By.xpath("//*[@id='main']/span/button")).click();
		WebElement ele2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/a")));
		driver.findElement(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/a")).click(); 
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/input[1]")));
		driver.findElement(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/input[1]")).sendKeys("user");
		WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/input[2]")));
		driver.findElement(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/input[2]")).sendKeys("password");
		WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/button")));
		driver.findElement(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/button")).click();
		///////////////////////////////////////////////////////////////////////////////////////////////////
		WebDriver driver2 = new ChromeDriver();  
		driver2.navigate().to("https://autothon-nagarro-frontend-e03.azurewebsites.net/");   
		
		WebElement tele = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/button")));
		driver2.findElement(By.xpath("//*[@id='main']/span/button")).click();
		WebElement tele2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/a")));
		driver2.findElement(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/a")).click(); 
		
		WebElement telement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.name("username")));
		driver2.findElement(By.name("username")).sendKeys("admin");
		
		WebElement telement2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/input[2]")));
		driver2.findElement(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/input[2]")).sendKeys("password");
		WebElement telement3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/button")));
		driver2.findElement(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/button")).click();
	}
}
