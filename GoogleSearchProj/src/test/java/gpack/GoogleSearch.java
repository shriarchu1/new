package gpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement searchname = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
    searchname.sendKeys("Sachin Tendulkar");
    WebElement Realname = driver.findElement(By.xpath("//div[@id='jZ2SBf']//div[1]"));
    Realname.click();
    System.out.println (driver.findElement(By.xpath("//div[@class='UFE1qd']")).isDisplayed());
    
    driver.close();
}
}