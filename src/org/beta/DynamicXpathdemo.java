package org.beta;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathdemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jelin\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.myntra.com/men-tshirts?extra_search_param=isautosuggestentry%3atrue%3a%3aid%3a2297-men-tshirts");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	List<Integer> priceList = new ArrayList<Integer>();
	
	List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"+"//following::span[@class='product-strike']"));	

for (WebElement x : allPrice)
	
	
{
	String newPrice = x.getText().replace("Rs. ", "");
	System.out.println(newPrice);
	//priceList.add(Integer.parseInt(newPrice));
	
	
	
	
}


}

}

