package org.cucu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipi_stepdefinition {
	public static WebDriver driver;
	EdgeOptions options = new EdgeOptions();
	@Given("launch a browser")

	
	public void launch_a_browser() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver(options);
		 options.addArguments("--disable-popup");
		 options.addArguments("--disable-notification");
		driver.get("https://www.flipkart.com/");
	 
	}

	@When("close the login button")
	public void close_the_login_button() {
		
		driver.findElement (By.xpath("//button [@class = '_2KpZ6l _2doB4z']")).click();	
			
	}

	@SuppressWarnings("deprecation")
	@And("user enter value and search")
	public void user_enter_value_and_search() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement user =driver.findElement(By.xpath("//input[@type ='text']"));
		 user.sendKeys("redmimobiles",Keys.ENTER);
		 
	   
	}

	@Then("validate the search result")
	public void validate_the_search_result() throws InterruptedException {
		Thread.sleep(5000);
		WebElement name =driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		String s = name.getText();
		System.out.println(s);
	
		
	}

	@When("quit the browser")
	public void quit_the_browser() {
		driver.quit();
	}
}
