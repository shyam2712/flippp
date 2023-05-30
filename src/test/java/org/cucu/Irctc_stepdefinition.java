package org.cucu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Irctc_stepdefinition  {
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Given("launch a browser and url")
	public void launch_a_browser_and_url() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://www.irctc.co.in");
	    
	}

	@When("user enter value or click from")
	public void user_enter_value_or_click_from() {
		WebElement user = driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c57-8')]"));
	   user.sendKeys("chennai");
	   driver.findElement(By.xpath("//span[text()='NEW DELHI - NDLS']")).click();	}

	@And("user enter value or click to")
	public void user_enter_value_or_click_to() {
		WebElement user1 = driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
		user1.sendKeys("bengaluru");
		driver.findElement(By.xpath("//span[text()='KSR BENGALURU - SBC']")).click();
	}

	@Then("validate the date")
	public void validate_the_date() {
   //  Assert.assertequals("18/05/2023","18/05/2023")
		
		WebElement q = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		String b = q.getText();
		System.out.println(b);
	}

	@When("user click on search")
	public void user_click_on_search() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

}
