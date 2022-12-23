package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       
		//System property for chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaha\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
      
        //Maximize window
        driver.manage().window().maximize();
        
        //Launch website
        driver.get("https://www.flipkart.com/");
       
       //Click on search text box and send value
        driver.findElement(By.className("_1_3w1N"));
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9762069865");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Nik@123");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
       
        //Searching product  
	    Thread.sleep(5000);
        WebElement searchBox=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		searchBox.sendKeys("Smart Watches");
		searchBox.submit();	
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click(); 
		
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		
		
	}

	
	
	

}
