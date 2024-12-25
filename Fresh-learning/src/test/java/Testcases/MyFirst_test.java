package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Basetest;

public class MyFirst_test extends Basetest{
	
	@Test
public static void Logintest() throws InterruptedException {
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div[4]/a[1]")).click();
	driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("shahealam900@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Lpu@q1w2e3");
	driver.findElement(By.xpath("//*[@id=\"nextbtn\"]")).click();
}
	

}
