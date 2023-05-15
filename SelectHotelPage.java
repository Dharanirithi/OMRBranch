package com.pages;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import net.bytebuddy.implementation.bytecode.collection.ArrayAccess;

public class SelectHotelPage extends BaseClass {
	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This class is used to capture locators of Select Hotel and following POM
	 *      design pattern
	 */

	public static String hotelName;
	public static String hotelPrize;

	public SelectHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//label[@for='value_pltoh']")
	private WebElement rdoLowToHigh;

	@FindBy(xpath = "//label[@for='value_phtol']")
	private WebElement rdoHighToLow;

	@FindBy(xpath = "//strong[@class='total-prize']")
	private List<WebElement> textAllPrize;

	@FindBy(xpath = "(//strong[@class='total-prize'])[1]")
	private WebElement textHotelPrize;

	@FindBy(xpath = "//a[text()='Continue'])[1]")
	private WebElement btnContinue;

	@FindBy(id = "room_type")
	private WebElement textRoomType;

	@FindBy(xpath = "//h5[text()='Select Hotel']")
	private WebElement textSelectHotel;

	@FindBy(xpath = "(//div[@class='col-md-5 hotel-suites'])[1]")
	private WebElement textHotelName;

	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']")
	private List<WebElement> textAllHotelName;

	public List<WebElement> getTextAllHotelName() {
		return textAllHotelName;
	}

	public WebElement getRdoLowToHigh() {
		return rdoLowToHigh;
	}

	public WebElement getRdoHighToLow() {
		return rdoHighToLow;
	}

	public List<WebElement> getTextAllPrize() {
		return textAllPrize;
	}

	public WebElement getTextHotelPrize() {
		return textHotelPrize;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTextRoomType() {
		return textRoomType;
	}

	public WebElement getTextSelectHotel() {
		return textSelectHotel;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to get select hotel success message
	 * @return Which will return actSelecthHotelSuccessMsg as a String
	 */

	public String selectHotelSuccessMsg() {

		String actSelecthHotelSuccessMsg = getTextData(getTextSelectHotel());
		return actSelecthHotelSuccessMsg;

	}

	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to get roomType text
	 * @return Which will return textRoomType as a String
	 */

	public String roomTypeText() {

		String textRoomType = getTextData(getTextRoomType());
		return textRoomType;

	}

	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to select first hotel and save hotel name and prize
	 */

	public void selectFirstHotelAndSave() {

		hotelName = getTextData(getTextHotelName());

		hotelPrize = getTextData(getTextHotelPrize());

		btnClick(getBtnContinue());

	}

	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to click radio button of low to high
	 */

	public void clickRadioLowToHigh() {
		btnClick(getRdoLowToHigh());
	}

	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to click radio button of high to low
	 */

	public void clickRadioHighToLow() {
		btnClick(getRdoHighToLow());
	}

	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to accept book hotel alert
	 */

	public void acceptBookHotelAlert() {
		switchConfirmAlertAccept();
	}

	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to dismiss book hotel alert
	 */

	public void dismissBookHotelAlert() {
		switchConfirmAlertDismiss();
	}

	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to sort hotel prize low to high
	 * @return Which will return b as a boolean
	 */

	public boolean sortHotelPrizeLowToHigh() {

		List<String> listBeforeSort = new ArrayList<String>();

		for (WebElement x : getTextAllPrize()) {
			String text = x.getText();
			String a = text.replace("$", "").replace(",", "").replace(" ", "");
			listBeforeSort.add(a);

		}

		List<String> listAfterSort = new ArrayList<String>();
		listAfterSort.addAll(listBeforeSort);
		Collections.sort(listAfterSort);
		boolean b = listBeforeSort.equals(listAfterSort);
		return b;

	}

	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to sort hotel prize high to low
	 * @return Which will return b as a boolean
	 */

	public boolean sortHotelPrizeHighToLow() {

		List<String> listBeforeSort = new ArrayList<String>();

		for (WebElement x : getTextAllPrize()) {
			String text = x.getText();
			String a = text.replace("$", "").replace(",", "").replace(" ", "");
			listBeforeSort.add(a);

		}

		List<String> listAfterSort = new ArrayList<String>();
		listAfterSort.addAll(listBeforeSort);
		Collections.sort(listAfterSort);
		Collections.reverse(listAfterSort);
		boolean b = listBeforeSort.equals(listAfterSort);
		return b;

	}

	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to verify roomType
	 * @return Which will return b as a boolean
	 */

	public boolean verifyRoomType(String selectRoomType) {

		List<Boolean> listHotelNames = new ArrayList<Boolean>();
		for (WebElement x : getTextAllHotelName()) {
			String text = x.getText();
			boolean a = text.contains(selectRoomType);
			listHotelNames.add(a);

		}

		boolean b = listHotelNames.contains(false);
		return b;

	}

}
