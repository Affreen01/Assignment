package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Uibank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://uibank.uipath.com/register-account'");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("Register For Account")).click();
		driver.findElement(By.id("firstName")).sendKeys("Affreen");
		driver.findElement(By.id("title")).sendKeys("UiBank");
		driver.findElement(By.id("middleName")).sendKeys("A");
		driver.findElement(By.id("lastName")).sendKeys("Fathima");
		WebElement element = driver.findElement(By.id("sex"));
		Select day=new Select(element);
		day.selectByVisibleText("Female");
		WebElement element1 = driver.findElement(By.id("employmentStatus")); 
		Select month=new Select(element1);
		month.selectByValue("Unemployed");
		driver.findElement(By.id("username")).sendKeys("Affreen");
		driver.findElement(By.id("email")).sendKeys("Affreen107@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Affreen@0101");  
//driver.close();

	}

}
