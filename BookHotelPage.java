package com.pages;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.impl.ServletContextCleaner;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.cucumber.datatable.DataTable;

/**
 * @author Dharani
 * @since 13/05/2023
 * @see This class is used to capture locators of Book Hotel and following POM
 *      design pattern
 */

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "own")
	private WebElement rdoMyself;

	@FindBy(id = "user_title")
	private WebElement ddnSalutaion;

	@FindBy(id = "first_name")
	private WebElement txtFirstName;

	@FindBy(id = "last_name")
	private WebElement txtLastName;

	@FindBy(id = "user_phone")
	private WebElement txtPhoneNo;

	@FindBy(id = "user_email")
	private WebElement txtEmailId;

	@FindBy(id = "gst")
	private WebElement chkGST;

	@FindBy(id = "gst_registration")
	private WebElement txtRegNo;

	@FindBy(id = "company_name")
	private WebElement txtCompanyName;

	@FindBy(id = "company_address")
	private WebElement txtCompanyAddress;

	@FindBy(id = "step1next")
	private WebElement btnNextGuest;

	@FindBy(id = "invalid-booking_for")
	private WebElement errorMsgBookingFor;

	@FindBy(id = "invalid-title")
	private WebElement errorMsgSalutation;

	@FindBy(id = "invalid-first_name")
	private WebElement errorMsgFirstName;

	@FindBy(id = "invalid-last_name")
	private WebElement errorMsgLastName;

	@FindBy(id = "invalid-phone")
	private WebElement errorMsgphone;

	@FindBy(id = "invalid-email")
	private WebElement errorMsgEmail;

	@FindBy(id = "late")
	private WebElement chkLateCheckin;

	@FindBy(id = "other_request")
	private WebElement txtOtherRequest;

	@FindBy(id = "step2next")
	private WebElement btnNextSplRequest;

	@FindBy(xpath = "//div[@class='credit-card pm']")
	private WebElement btnCradPayment;

	@FindBy(id = "payment_type")
	private WebElement ddnPaymentType;

	@FindBy(id = "card_type")
	private WebElement ddnCardType;

	@FindBy(id = "card_no")
	private WebElement txtCardNo;

	@FindBy(id = "card_name")
	private WebElement txtCardName;

	@FindBy(id = "card_month")
	private WebElement ddnCardMonth;

	@FindBy(id = "card_year")
	private WebElement ddnCardYear;

	@FindBy(id = "cvv")
	private WebElement txtCvv;

	@FindBy(id = "submitBtn")
	private WebElement btnSubmit;

	@FindBy(xpath = "//div[@class='row']")
	private WebElement textBookHotel;

	public WebElement getRdoMyself() {
		return rdoMyself;
	}

	public WebElement getDdnSalutaion() {
		return ddnSalutaion;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtPhoneNo() {
		return txtPhoneNo;
	}

	public WebElement getTxtEmailId() {
		return txtEmailId;
	}

	public WebElement getChkGST() {
		return chkGST;
	}

	public WebElement getTxtRegNo() {
		return txtRegNo;
	}

	public WebElement getTxtCompanyName() {
		return txtCompanyName;
	}

	public WebElement getTxtCompanyAddress() {
		return txtCompanyAddress;
	}

	public WebElement getBtnNextGuest() {
		return btnNextGuest;
	}

	public WebElement getErrorMsgBookingFor() {
		return errorMsgBookingFor;
	}

	public WebElement getErrorMsgSalutation() {
		return errorMsgSalutation;
	}

	public WebElement getErrorMsgFirstName() {
		return errorMsgFirstName;
	}

	public WebElement getErrorMsgLastName() {
		return errorMsgLastName;
	}

	public WebElement getErrorMsgphone() {
		return errorMsgphone;
	}

	public WebElement getErrorMsgEmail() {
		return errorMsgEmail;
	}

	public WebElement getChkLateCheckin() {
		return chkLateCheckin;
	}

	public WebElement getTxtOtherRequest() {
		return txtOtherRequest;
	}

	public WebElement getBtnNextSplRequest() {
		return btnNextSplRequest;
	}

	public WebElement getBtnCradPayment() {
		return btnCradPayment;
	}

	public WebElement getDdnPaymentType() {
		return ddnPaymentType;
	}

	public WebElement getDdnCardType() {
		return ddnCardType;
	}

	public WebElement getTxtCardNo() {
		return txtCardNo;
	}

	public WebElement getTxtCardName() {
		return txtCardName;
	}

	public WebElement getDdnCardMonth() {
		return ddnCardMonth;
	}

	public WebElement getDdnCardYear() {
		return ddnCardYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getTextBookHotel() {
		return textBookHotel;
	}

	/**
	 * @author Dharani
	 * @since 13/05/2023
	 * @see This method is used to get success message
	 * @return Which will return actBookHotelSuccessMsg as a String
	 */

	public String bookHotelSuccessMsg() {

		String actBookHotelSuccessMsg = getTextData(getTextBookHotel());
		return actBookHotelSuccessMsg;

	}

	/**
	 * @author Dharani
	 * @since 13/05/2023
	 * @param salutation,firstName,lastName,mobileNo
	 *            and emailAddress should be passed as a String
	 * @see This method is used to enter Guest details in book hotel page
	 */

	public void guestDetails(String salutation, String firstName, String lastName, String mobileNo,
			String emailAddress) {

		btnClick(getRdoMyself());
		selectVisibleText(getDdnSalutaion(), salutation);
		insertValues(getTxtFirstName(), firstName);
		insertValues(getTxtLastName(), lastName);
		insertValues(getTxtPhoneNo(), mobileNo);
		insertValues(getTxtEmailId(), emailAddress);
		btnClick(getBtnNextGuest());

	}

	/**
	 * @author Dharani
	 * @since 13/05/2023
	 * @param regNo,companyName
	 *            and companyAddress should be passed as a String
	 * @see This method is used to enter GST details in book hotel page
	 */

	public void gstDetails(String regNo, String companyName, String companyAddress) {
		btnClick(getChkGST());
		insertValues(getTxtRegNo(), regNo);
		insertValues(getTxtCardName(), companyName);
		insertValues(getTxtCompanyAddress(), companyAddress);
		btnClick(getBtnNextGuest());
	}

	/**
	 * @author Dharani
	 * @since 13/05/2023
	 * @param specialRequest
	 *            should be passed as a String
	 * @see This method is used to enter special request details in book hotel page
	 */

	public void specialRequest(String specialRequest) {

		btnClick(getChkLateCheckin());
		insertValues(getTxtOtherRequest(), specialRequest);
		btnClick(getBtnNextSplRequest());
	}

	/**
	 * @author Dharani
	 * @since 13/05/2023
	 * @see This method is used to click next button without entering any guest
	 *      details in book hotel page
	 */

	public void withoutEnterAnyGuestDetails() {

		btnClick(getBtnNextGuest());

	}

	/**
	 * @author Dharani
	 * @since 13/05/2023
	 * @see This method is used to get booking error message in book hotel page
	 * @return Which will return actBookingForErrorMsg as a String
	 */

	public String bookingForErrorMsg() {

		String actBookingForErrorMsg = getTextData(getErrorMsgBookingFor());
		return actBookingForErrorMsg;

	}

	/**
	 * @author Dharani
	 * @since 13/05/2023
	 * @see This method is used to get salutaion error message in book hotel page
	 * @return Which will return actSalutationErrorMsg as a String
	 */

	public String salutationErrorMsg() {

		String actSalutationErrorMsg = getTextData(getErrorMsgSalutation());
		return actSalutationErrorMsg;
	}

	/**
	 * @author Dharani
	 * @since 13/05/2023
	 * @see This method is used to get FirstName error message in book hotel page
	 * @return Which will return actFirstNameErrorMsg as a String
	 */

	public String firstNameErrorMsg() {

		String actFirstNameErrorMsg = getTextData(getErrorMsgFirstName());
		return actFirstNameErrorMsg;
	}

	/**
	 * @author Dharani
	 * @since 13/05/2023
	 * @see This method is used to get LastName error message in book hotel page
	 * @return Which will return actLastNameErrorMsg as a String
	 */

	public String lastNameErrorMsg() {

		String actLastNameErrorMsg = getTextData(getErrorMsgLastName());
		return actLastNameErrorMsg;

	}

	/**
	 * @author Dharani
	 * @since 13/05/2023
	 * @see This method is used to get phoneNo error message in book hotel page
	 * @return Which will return actMobileNoErrorMsg as a String
	 */

	public String phoneErrorMsg() {

		String actMobileNoErrorMsg = getTextData(getErrorMsgphone());
		return actMobileNoErrorMsg;
	}

	/**
	 * @author Dharani
	 * @since 13/05/2023
	 * @see This method is used to get email error message in book hotel page
	 * @return Which will return actEmailErrorMsg as a String
	 */

	public String emailErrorMsg() {

		String actEmailErrorMsg = getTextData(getErrorMsgEmail());
		return actEmailErrorMsg;
	}

	/**
	 * @author Dharani
	 * @since 13/05/2023
	 * @param cardType
	 *            should be passed as a String and dataTable should be passed as a
	 *            DataTable
	 * @see This method is used to enter payment details in book hotel page
	 */

	public void paymentDetails(String cardType, DataTable dataTable) {

		btnClick(getBtnCradPayment());
		selectVisibleText(getDdnPaymentType(), cardType);
		List<Map<String, String>> cardDetails = dataTable.asMaps();
		switch (cardType) {
		case "Debit Card":

			Map<String, String> m = cardDetails.get(0);
			selectVisibleText(getDdnCardType(), m.get("selectCard"));
			insertValues(getTxtCardNo(), m.get("cardNo"));
			insertValues(getTxtCardName(), m.get("nameOnCard"));
			selectVisibleText(getDdnCardMonth(), m.get("selectMonth"));
			selectVisibleText(getDdnCardYear(), m.get("selectYear"));
			insertValues(getTxtCvv(), m.get("cvv"));
			btnClick(getBtnSubmit());
			break;
		case "Credit Card":

			Map<String, String> m1 = cardDetails.get(4);
			selectVisibleText(getDdnCardType(), m1.get("selectCard"));
			insertValues(getTxtCardNo(), m1.get("cardNo"));
			insertValues(getTxtCardName(), m1.get("nameOnCard"));
			selectVisibleText(getDdnCardMonth(), m1.get("selectMonth"));
			selectVisibleText(getDdnCardYear(), m1.get("selectYear"));
			insertValues(getTxtCvv(), m1.get("cvv"));
			btnClick(getBtnSubmit());
			break;

		default:
			break;
		}

	}

}