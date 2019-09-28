package seti2.test.authon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SecondTask {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\deepanshusharma\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.navigate().to("https://autothon-nagarro-frontend-e03.azurewebsites.net/");  
		driver.manage().window().maximize(); 
		System.out.println("1");
		/////////////
		WebElement ele = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/button")));
		driver.findElement(By.xpath("//*[@id='main']/span/button")).click();

		WebElement ele2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/a")));
		driver.findElement(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/a")).click(); 
		
		WebElement element = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/input[1]")));
		driver.findElement(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/input[1]")).sendKeys("admin");
		WebElement element2 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/input[2]")));
		driver.findElement(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/input[2]")).sendKeys("password");
		WebElement element3 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/button")));
		driver.findElement(By.xpath("//*[@id='main']/span/div/div/ul/li[2]/div/div/div/button")).click();
		WebElement element4 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/span/div/div/ul/div/li/a")));
		driver.findElement(By.xpath("//*[@id='main']/span/div/div/ul/div/li/a")).click();
		WebElement element5 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/div[1]/div/input")));
		driver.findElement(By.xpath("//*[@id='main']/div/div[1]/div/input")).sendKeys("harry potter2");
		WebElement element6 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/div[2]/div/input")));
		driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div/input")).sendKeys("JK Rowling");
		WebElement element7 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/div[3]/div/textarea")));
		driver.findElement(By.xpath("//*[@id='main']/div/div[3]/div/textarea")).sendKeys("movie based on magic!!");
		WebElement element8 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/div[4]/div/select/option[3]")));
		driver.findElement(By.xpath("//*[@id='main']/div/div[4]/div/select/option[3]")).click();
		
		WebElement element9 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/div[5]/div/input")));
		driver.findElement(By.xpath("//*[@id='main']/div/div[5]/div/input")).sendKeys("https://mypostercollection.com/wp-content/uploads/2018/09/Harry-Potter-Poster-2001-MyPosterCollection.com-4-691x1024.jpg");	
	
		WebElement element10 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/div[6]/div/svg[3]/path")));
		driver.findElement(By.xpath("//*[@id='main']/div/div[6]/div/svg[3]/path")).click();

		WebElement element11 = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='main']/div/div[7]/div/div/button[1]")));
		driver.findElement(By.xpath("//*[@id='main']/div/div[7]/div/div/button[1]")).click();
		
	}
}
