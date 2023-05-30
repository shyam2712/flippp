package org.cucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus_stepdefinition {
	public static WebDriver driver;

@Given("launch the url")
public void launch_the_url() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://www.redbus.in/bus-tickets");
}

@Given("click on the start location")
public void click_on_the_start_location(String win) throws InterruptedException {
   WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
  user.sendKeys(win)  ;
  Thread.sleep(9000);
  driver.findElement(By.xpath("//ul[@id='C120_suggestion-wrap']")).click();
 
  }

@When("cick on the end location")
public void cick_on_the_end_location(String lose) throws InterruptedException {
	
	 WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	  user.sendKeys(lose)  ;
	  Thread.sleep(9000);
	  driver.findElement(By.xpath("//div[@class='C120_suggestions_list_area'][1]")).click();}


@Then("validate date")
public void validate_date()throws InterruptedException {
	Thread.sleep(5000);
	 WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	 Thread.sleep(9000);
	 user.sendKeys("19/05/2023")  ;
}

@When("click on search")
public void click_on_search() throws InterruptedException {
	Thread.sleep(9000);
   driver.findElement(By.xpath("//button[@class='D120_search_btn searchBuses']")).click();
}

//	///////scenario 2////////////////// 
@Given("launch the url  {string}")
public void launch_the_url(String url) {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get(url);
	
	
}

@Given("click on the start_destination    {string}")
public void click_on_the_start_destination(String csk) throws InterruptedException{
	 WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	   user.sendKeys(csk)  ;
	   Thread.sleep(9000);
	   driver.findElement(By.xpath("//ul[@id='C120_suggestion-wrap']")).click();
 
}

@When("cick on the end_destination    {string}")
public void cick_on_the_end_destination(String srh)throws InterruptedException {
	 WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	  user.sendKeys(srh)  ;
	  Thread.sleep(9000);
	  driver.findElement(By.xpath("//div[@class='C120_suggestions_list_area'][1]")).click();}


@Given("click on the start_destination with one dim list")
//public void click_on_the_start_destination_with_one_dim_list(io.cucumber.datatable.DataTable dataTable) {
//   List<String> user = datatable.aslist();

@When("cick on the end_destination with one dim list")
//public void cick_on_the_end_destination_with_one_dim_list(io.cucumber.datatable.DataTable dataTable) {
//    // Write code here that turns the phrase above into concrete actions
//    // For automatic transformation, change DataTable to one of
//    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//    //
//    // For other transformations you can register a DataTableType.
//    throw new io.cucumber.java.PendingException();
//}





@Then("click on the_submit")
public void click_on_the_submit() throws InterruptedException {
	Thread.sleep(5000);
	 driver.findElement(By.xpath("//button[@class='D120_search_btn searchBuses']")).click();
	}
   


@When("quit the_browser")
public void quit_the_browser() {
   driver.quit();
}

}
