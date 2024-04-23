package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello_World {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.numpyninja.com/");
		WebElement contus=driver.findElement(By.id("comp-l19k7i034label"));
		contus.click();
		 WebElement fname=driver.findElement(By.name("first-name"));
		 fname.sendKeys("name");
		 WebElement lname=driver.findElement(By.name("last-name"));
		 lname.sendKeys("lastname");
		 WebElement eml=driver.findElement(By.name("email"));
		 eml.sendKeys("myemail@gmail.com");
		 WebElement phn=driver.findElement(By.name("phone"));
		 phn.sendKeys("5473094032");
		 WebElement text=driver.findElement(By.id("textarea_comp-l1c0ku07"));
		 text.sendKeys("nothing to say");
		 WebElement btn=driver.findElement(By.id("comp-l1c0ku0e3"));
		 btn.click();
		 driver.close();
		 
		 
		
		
		
	}

}
