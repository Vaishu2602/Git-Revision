	package org.locators;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage extends BaseClass{
	public AdactinLoginPage() {
		
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(id = "username")
	private WebElement txtUserName;
	
	
	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(name = "login")
	private WebElement btnClick;

	public WebElement getTxtUserName() {
		return txtUserName;
	}
	private void test1() {
		// TODO Auto-generated method stub
	System.out.println("done");
	}
private void test2() {
	// TODO Auto-generated method stub
System.out.println("Test 2 done");
}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	

}
