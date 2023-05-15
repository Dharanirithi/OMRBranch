package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {
	/**
	 * @author Dharani
	 * @since 11/05/2023
	 * @see This class is used to capture locators of Login Page and following POM
	 *      design pattern
	 */

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement txtEmail;

	@FindBy(id = "pass")
	private WebElement txtPassword;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	private WebElement btnLogin;

	@FindBy(id = "errorMessage")
	private WebElement errorMsgLogin;

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getErrorMsgLogin() {
		return errorMsgLogin;
	}

	/**
	 * @author Dharani
	 * @since 11/05/2023
	 * @see This method is used to perform login functionality
	 * @param emailAddress
	 *            and password should be passed as a string
	 */

	public void login(String emailAddress, String password) {
		insertValues(getTxtEmail(), emailAddress);
		insertValues(getTxtPassword(), password);
		btnClick(getBtnLogin());
	}

	/**
	 * @author Dharani
	 * @since 11/05/2023
	 * @see This method is used to perform login functionality using Enter key
	 * @param emailAddress
	 *            and password should be passed as a string
	 */

	public void loginWithEnterKey(String emailAddress, String password) {
		insertValues(getTxtEmail(), emailAddress);
		insertValues(getTxtPassword(), password);
		keypressEnter();
	}

	/**
	 * @author Dharani
	 * @since 11/05/2023
	 * @see This method is used to get login error message
	 * @return Which will return actLoginErrorMsg as a string
	 */

	public String loginErrorMsg() {
		String actLoginErrorMsg = getTextData(getErrorMsgLogin());
		return actLoginErrorMsg;

	}

}
