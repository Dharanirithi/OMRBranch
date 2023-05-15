package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class MyBookingPage extends BaseClass {

	/**
	 * @author Dharani
	 * @since 15/05/2023
	 * @see This class is used to capture locators of My Booking page and following
	 *      POM design pattern
	 */

	public MyBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "search")
	private WebElement txtSearch;

	@FindBy(xpath = "//button[text()='Edit']")
	private WebElement btnEdit;

	@FindBy(xpath = "//a[text()='Cancel']")
	private WebElement btnCancel;

	@FindBy(name = "check_in")
	private WebElement txtCheckinchange;

	@FindBy(xpath = "//button[text()='Confirm']")
	private WebElement btnConfirm;

	@FindBy(xpath = "//li[text()='Booking updated successfully']")
	private WebElement textMsgBookingUpdated;

	@FindBy(xpath = "//li[text()='Your booking cancelled successfully']")
	private WebElement textMsgBookingCancelled;

	@FindBy(id = "bookings")
	private WebElement textBookings;

	@FindBy(xpath = "//div[@class='room-code']")
	private WebElement textorderid;

	@FindBy(xpath = "//strong[@class='total-prize']")
	private WebElement txtPrice;

	@FindBy(xpath = "div[@class='col-md-7 mobile-space-none']/a/h5[1]")
	private WebElement txtHotel;

	public WebElement getTextorderid() {
		return textorderid;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getTxtCheckinchange() {
		return txtCheckinchange;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getTextMsgBookingUpdated() {
		return textMsgBookingUpdated;
	}

	public WebElement getTextMsgBookingCancelled() {
		return textMsgBookingCancelled;
	}

	public WebElement getTextBookings() {
		return textBookings;
	}

	public WebElement getTxtPrice() {
		return txtPrice;
	}

	public WebElement getTxtHotel() {
		return txtHotel;
	}

	/**
	 * @author Dharani
	 * @since 15/05/2023
	 * @see This method is used to edit and change the checkin date
	 */

	public void editAndChangeCheckinDate(String updatedCheckIn) {

		btnClick(getBtnEdit());
		insertByJavascript(getTxtCheckinchange(), updatedCheckIn);
		btnClick(getBtnConfirm());

	}

	/**
	 * @author Dharani
	 * @since 15/05/2023
	 * @see This method is used to get booking page Success message
	 * @return Which will return actBookingPageSuccessPage as a string
	 */

	public String bookingPageSuccessMsg() {

		String actBookingPageSuccessPage = getTextData(getTextBookings());
		return actBookingPageSuccessPage;

	}

	/**
	 * @author Dharani
	 * @since 15/05/2023
	 * @see This method is used to get booking updated success message
	 * @return Which will return actBookingUpdatedSuccessMsg as a string
	 */

	public String bookingUpdatedSuccessMsg() {

		String actBookingUpdatedSuccessMsg = getTextData(getTextMsgBookingUpdated());
		return actBookingUpdatedSuccessMsg;

	}

	/**
	 * @author Dharani
	 * @since 15/05/2023
	 * @see This method is used to get booking cancel Success message
	 * @return Which will return actBookingCancelMsg as a string
	 */

	public String bookingCancelSuccessMsg() {

		String actBookingCancelMsg = getTextData(getTextMsgBookingCancelled());
		return actBookingCancelMsg;

	}

	/**
	 * @author Dharani
	 * @since 15/05/2023
	 * @see This method is used to verify hotel name
	 * @return Which will return verifyHotelName as a boolean
	 */

	public boolean verifyHotelName() {

		String bookedHotel = getTextData(getTxtHotel());
		boolean verifyHotelName = bookedHotel.equalsIgnoreCase(SelectHotelPage.hotelName);
		return verifyHotelName;
	}

	/**
	 * @author Dharani
	 * @since 15/05/2023
	 * @see This method is used to verify hotel price
	 * @return Which will return verifyHotelPrice as a boolean
	 */

	public boolean verifyHotelPrize() {

		String bookedHotelPrice = getTextData(getTxtPrice());
		boolean verifyHotelPrice = bookedHotelPrice.equalsIgnoreCase(SelectHotelPage.hotelPrize);
		return verifyHotelPrice;
	}

	/**
	 * @author Dharani
	 * @since 15/05/2023
	 * @see This method is used to verify orderid
	 * @return Which will return verifyOrderId as a boolean
	 */
	public boolean verifyOrderId() {

		String bookedOrderid = getTextData(getTextorderid());
		boolean verifyOrderId = bookedOrderid.equalsIgnoreCase(BookingConfirmPage.orderId);
		return verifyOrderId;
	}

	/**
	 * @author Dharani
	 * @since 15/05/2023
	 * @see This method is used to search for generated orderid
	 */

	public void searchForGeneratedOrderId() {

		insertValues(getTxtSearch(), BookingConfirmPage.orderId);

	}

	/**
	 * @author Dharani
	 * @since 15/05/2023
	 * @see This method is used to cancel orderid
	 */
	public void cancelOrderId() {

		btnClick(getBtnCancel());
	}

	/**
	 * @author Dharani
	 * @since 15/05/2023
	 * @see This method is used to search for Existing orderid
	 */

	public void searchForExisitingOrderId(String existOrderid) {

		insertValues(getTxtSearch(), existOrderid);

	}
}
