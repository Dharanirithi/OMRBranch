package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate.Param;

/**
 * @author Dharani
 * @since 14/05/2023
 * @see This class is used to capture locators of Booking Confirm page and
 *      following POM design pattern
 */

public class BookingConfirmPage extends BaseClass {
	public static String orderId;

	public BookingConfirmPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h2[@class='couppon-code']/strong")
	private WebElement textOrderId;

	@FindBy(xpath = "//h2[@class='couppon-code']/strong/folllowing::text()[1]")
	private WebElement textBookingconfirm;

	@FindBy(xpath = "//p[text()='Hotel ']")
	private WebElement textHotelName;

	@FindBy(xpath = "//button[text()='My Booking']")
	private WebElement btnMyBooking;

	public WebElement getTextBookingconfirm() {
		return textBookingconfirm;
	}

	public WebElement getTextOrderId() {
		return textOrderId;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getBtnMyBooking() {
		return btnMyBooking;
	}

	/**
	 * @author Dharani
	 * @since 14/05/2023
	 * @see This method is used to save generated order id and get booking success
	 *      message
	 * @return Which will return actpBookingSuccessMsg as a String
	 */

	public String bookHotelSuccessMsg() {
		String generatedOrderId = getTextData(getTextOrderId());
		orderId = generatedOrderId.substring(1);
		String actpBookingSuccessMsg = getTextData(getTextBookingconfirm());
		return actpBookingSuccessMsg;

	}

	/**
	 * @author Dharani
	 * @since 14/05/2023
	 * @see This method is used to same hotel name is present
	 * @return Which will return b as a boolean
	 */

	public boolean verifySelectedHotel() {
		String bookedHotelName = getTextData(getTextHotelName());
		boolean b = bookedHotelName.equalsIgnoreCase(SelectHotelPage.hotelName);
		return b;
	}

	/**
	 * @author Dharani
	 * @since 14/05/2023
	 * @see This method is used to navigate from booking confirm page to My booking
	 */

	public void navigateToMyBookingFromBookingConfirmPage() {

		btnClick(getBtnMyBooking());
	}

}
