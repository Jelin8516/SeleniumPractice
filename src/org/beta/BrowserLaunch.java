package org.beta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch {
  public static WebDriver driver ;
public static void main(String[] args) throws InterruptedException {

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jelin\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	driver.get("http://adactinhotelapp.com");
	
	WebElement hotel = driver.findElement(By.id("username"));
	hotel.sendKeys("keshavunique");
	
	WebElement pwd = driver.findElement(By.id("password"));
	pwd.sendKeys("12345678");
	Thread.sleep(10000);
	
	
	WebElement clk = driver.findElement(By.id("login"));
	clk.click();
	
	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
	Select select = new Select(location);
	select.selectByValue("Sydney");
	Thread.sleep(5000);
	
	WebElement htl = driver.findElement(By.xpath("//select[@name='hotels']"));
	
	Select sel= new Select (htl);
	sel.selectByVisibleText("Hotel Hervey");
	
	WebElement sel2 = driver.findElement(By.xpath("//select[@name='room_type']"));
	
	Select h_type = new Select(sel2);
	h_type.selectByValue("Standard");
	
	WebElement sel3 = driver.findElement(By.xpath("//select[@name='room_nos']"));
	Select type = new Select(sel3);
	type.selectByIndex(1);
	
	WebElement datein = driver.findElement(By.id("datepick_in"));
	//Actions a = new Actions(driver);
	//a.doubleClick(datein);
	datein.clear();
	
	datein.sendKeys("10/2/1997");
	
	
	
	WebElement chekin = driver.findElement(By.id("adult_room"));
	Select ck= new Select (chekin);
	ck.selectByValue("2");
	
	WebElement chld = driver.findElement(By.id("child_room"));
	Select ck1 = new Select (chld);
	ck1.selectByValue("2");
	
	
	WebElement click1 = driver.findElement(By.id("Submit"));
	click1.click();
	
	WebElement btn2 = driver.findElement(By.id("radiobutton_0"));
	btn2.click();
	
	WebElement ctnue = driver.findElement(By.id("continue"));
	ctnue.click();
	
	WebElement name = driver.findElement(By.xpath("//input[@name='first_name']"));
	
	name.sendKeys("Jelin");
	
	WebElement lstname = driver.findElement(By.xpath("//input[@name='last_name']"));
	lstname.sendKeys("Rathna");
	
	WebElement adrs = driver.findElement(By.xpath("//textarea[@name='address']"));
	adrs.sendKeys("avadi chennai");
	
	WebElement cc = driver.findElement(By.id("cc_num"));
	cc.sendKeys("1234567890123456");
	
	WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
     Select sel7 = new Select(cctype);
     sel7.selectByVisibleText("American Express");
     
     WebElement mnthsel = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
     Select mnth = new Select (mnthsel);
     mnth.selectByIndex(9);
     
     WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
     Select yr = new Select (year);
     yr.selectByVisibleText("2021");
     
     WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
     cvv.sendKeys("123");
     
     WebElement bk = driver.findElement(By.xpath("//input[@type='button'][1]"));
     bk.click();
     
     
     


	
	
	
	
	
	
	
			
			
	 
	
	
	
	
	
	
	
}
}
