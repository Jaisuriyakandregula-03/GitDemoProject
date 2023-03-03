package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_Google_Search {

	public static void main(String[] args) {
		
		googleSearch();

	}

	public static void googleSearch() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.findElement(By.name("q")).sendKeys("opentext pvt ltd");
		
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.RETURN);
		
		driver.close();
		
		System.out.println("Test completed Successfully");
		
		
	}
}
