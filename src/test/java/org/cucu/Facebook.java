package org.cucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static WebDriver driver;
	
	

@Given("click the create account button")
public void click_the_create_account_button() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://facebook.com/");
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
}

@When("select first name")
public void select_first_name()throws InterruptedException  {
	Thread.sleep(6000);
	WebElement user2 =driver.findElement(By.xpath("//input[@name='firstname']"));
	user2.sendKeys("shyam");
	Thread.sleep(2000);
}

@When("select lastname")
public void select_lastname() throws InterruptedException {
	WebElement user1 =driver.findElement(By.xpath("//input[@name='lastname']"));
	user1.sendKeys("kumar");
	Thread.sleep(2000);
}

@When("give the valuable input")
public void give_the_valuable_input()throws InterruptedException  {
	WebElement user =driver.findElement(By.xpath("//input[@name='reg_email__']"));
	user.sendKeys("7584009686");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("shyam@27");
	 
}

@When("select the dropdown")
public void select_the_dropdown()throws InterruptedException  {
	WebElement single =	driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select  s = new Select (single);
	s.selectByVisibleText("1995");
	Thread.sleep(5000);
}

@When("click on signup_button")
public void click_on_signup_button() {
	driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
	driver.findElement(By.xpath("//button[@name='websubmit']")).click();
}


@Given("launch url")
public void launch_url() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://facebook.com/");
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	
	
}

@When("select first name    {string}")
public void select_first_name(String string) throws InterruptedException {
	Thread.sleep(6000);
	WebElement user2 =driver.findElement(By.xpath("//input[@name='firstname']"));
	user2.sendKeys("shyam");
	Thread.sleep(2000);}
//}}
//	WebElement user1 =driver.findElement(By.xpath("//input[@name='lastname']"));
//	user1.sendKeys("kumar");
//	Thread.sleep(2000);
//}


@When("give the valuable input {string}")
public void give_the_valuable_input(String string) {
	WebElement user =driver.findElement(By.xpath("//input[@name='reg_email__']"));
	user.sendKeys("7584009686");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("shyam@27");
	 
   
}
	

}
