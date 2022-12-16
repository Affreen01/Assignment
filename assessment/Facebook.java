package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com/'");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Create New Account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Affreen");
	driver.findElement(By.name("lastname")).sendKeys("Fathima");
	driver.findElement(By.name("reg_email__")).sendKeys("affreen@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("Affreen@0101");                                
	WebElement element = driver.findElement(By.id("day"));                                
	Select day=new Select(element);
	day.selectByValue("1");
	WebElement element1 = driver.findElement(By.id("month"));                                
	Select month=new Select(element1);
	month.selectByValue("1");
	WebElement element3 = driver.findElement(By.id("year"));                                
	Select year=new Select(element3);
	year.selectByVisibleText("2002");
	driver.findElement(By.name("sex")).click();
	//driver.close();
	
 
	}

}
