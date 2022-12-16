package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class TamilMatrimony {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("REGISTERED_BY"));
		Select profile=new Select(element);
		profile.selectByVisibleText("Myself");
		driver.findElement(By.name("NAME")).sendKeys("Affreen");
		driver.findElement(By.id("genderfemale")).click();
		WebElement elemen = driver.findElement(By.id("DOBDAY"));                                
		Select day=new Select(elemen);
		day.selectByValue("1");
		WebElement element1 = driver.findElement(By.id("DOBMONTH"));                                
		Select month=new Select(element1);
		month.selectByValue("1");
		WebElement element3 = driver.findElement(By.id("DOBYEAR"));                                
		Select year=new Select(element3);
		year.selectByVisibleText("2002");
		WebElement relegion = driver.findElement(By.id("RELIGION"));                                
		Select test=new Select(relegion);
		test.selectByVisibleText("Muslim - Shia");
		WebElement mother = driver.findElement(By.id("MOTHERTONGUE"));                                
		Select language=new Select(mother);
		language.selectByVisibleText("Urdu");
		WebElement text = driver.findElement(By.id("COUNTRY"));                                
		Select object=new Select(text);
		object.selectByVisibleText("India");
		WebElement country = driver.findElement(By.id("M_COUNTRYCODE"));                                
		Select code=new Select(country);
		code.selectByVisibleText("+91");
		driver.findElement(By.id("MOBILENO")).sendKeys("9884855801");
		driver.findElement(By.id("EMAIL")).sendKeys("affreen107@gmail.com");
		driver.findElement(By.id("genderfemale")).click();
		driver.findElement(By.name("PASSWD1")).sendKeys("Affreen@0101"); 
//driver.close();
	}

}
