package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	 WebDriver driver;
	@Given("User is on facebook website")
	public void user_is_on_facebook_website() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\CucuPro\\Driver\\chromedriver.exe" );
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	}

	@When("User should enter username and password")
	public void user_should_enter_username_and_password() {
	   WebElement txtUser = driver.findElement(By.id("email"));
	   txtUser.sendKeys("prabhuroger7@gmail.com");
	   WebElement txtpass = driver.findElement(By.id("pass"));
	   txtpass.sendKeys("PRAISHU252677");
	}

	@When("User should click login button")
	public void user_should_click_login_button() {
	   WebElement btnclick = driver.findElement(By.name("login"));
	   btnclick.click();
	}

	@Then("User should validate home page is present or not")
	public void user_should_validate_home_page_is_present_or_not() {
	System.out.println("Aunthentication Failure");
	   
	}

}
