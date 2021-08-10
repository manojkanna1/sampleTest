package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleProject {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver amazon=new ChromeDriver();
		amazon.get("https://www.amazon.in/");
		amazon.manage().window().maximize();
		
		WebElement txtSearch = amazon.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("TV",Keys.ENTER);

}
}