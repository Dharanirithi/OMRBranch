package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ExploreHotelPage extends BaseClass {
	
	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This class is used to capture locators of Explore Hotel page and following POM design pattern
	 */

	
	public ExploreHotelPage() {
		
		PageFactory.initElements(driver, this);
	
 }
	
	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement clkUserWelcome;
	
	@FindBy(xpath="//a[text()='My Account']")
	private WebElement clkMyAccpunt;
	

	@FindBy(id="state")
	private WebElement ddnState;
	
	@FindBy(id="city")
	private WebElement ddnCity;
	
	@FindBy(id="room_type")
	private WebElement ddnRoomType;
	
	@FindBy(name="check_in")
	private WebElement txtCheckin;
	
	@FindBy(name="check_out")
	private WebElement txtCheckout;
	
	@FindBy(id="no_rooms")
	private WebElement ddnNoOfRooms;
	
	@FindBy(id="no_adults")
	private WebElement ddnNoOfAdults;
	
	@FindBy(id="no_child")
	private WebElement txtNoOfChild;
	
	@FindBy(id="hotelsearch_iframe")
	private WebElement frameSearch;
	
	@FindBy(id="searchBtn")
	private WebElement btnSearch;
	
	@FindBy(id="invalid-state")
	private WebElement errorMsgState;
	
	@FindBy(id="invalid-city")
	private WebElement errorMsgCity;
	
	@FindBy(id="invalid-check_in")
	private WebElement errorMsgCheckin;
	
	@FindBy(id="invalid-check_out")
	private WebElement errorMsgCheckout;
	
	@FindBy(id="invalid-no_rooms")
	private WebElement errorMsgNoOfRooms;
	
	@FindBy(id="invalid-no_adults")
	private WebElement errorMsgNoOfAdults;
	
	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement ddnWelcomeMsg;
	
	@FindBy(xpath="//h5[text()='Explore Hotels']")
	private WebElement textExploreHotel;
	
	

	public WebElement getClkUserWelcome() {
		return clkUserWelcome;
	}

	public WebElement getClkMyAccpunt() {
		return clkMyAccpunt;
	}

	public WebElement getDdnState() {
		return ddnState;
	}

	public WebElement getDdnCity() {
		return ddnCity;
	}

	public WebElement getDdnRoomType() {
		return ddnRoomType;
	}

	public WebElement getTxtCheckin() {
		return txtCheckin;
	}

	public WebElement getTxtCheckout() {
		return txtCheckout;
	}

	public WebElement getDdnNoOfRooms() {
		return ddnNoOfRooms;
	}

	public WebElement getDdnNoOfAdults() {
		return ddnNoOfAdults;
	}

	public WebElement getTxtNoOfChild() {
		return txtNoOfChild;
	}

	public WebElement getFrameSearch() {
		return frameSearch;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public WebElement getErrorMsgState() {
		return errorMsgState;
	}

	public WebElement getErrorMsgCity() {
		return errorMsgCity;
	}

	public WebElement getErrorMsgCheckin() {
		return errorMsgCheckin;
	}

	public WebElement getErrorMsgCheckout() {
		return errorMsgCheckout;
	}

	public WebElement getErrorMsgNoOfRooms() {
		return errorMsgNoOfRooms;
	}

	public WebElement getErrorMsgNoOfAdults() {
		return errorMsgNoOfAdults;
	}
	public WebElement getDdnWelcomeMsg() {
		return ddnWelcomeMsg;
	}

	public WebElement getTextExploreHotel() {
		return textExploreHotel;
	}
	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to get login success message 
	 * @return Which will return actloginSuccessMsg as a String 
	 */

	public String loginSuccessMsg() {
		
		String actloginSuccessMsg = getTextData(getTextExploreHotel());
		return actloginSuccessMsg;
         
}
	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to select all the fields in explore hotel page
	 * @param selectState,selectCity,selectRoomType,checkIn,checkOut,noOfRoom,noOfAdults and noOfChildren should be passed as a String
	 */

	
	public void exploreHotel(String selectState, String selectCity, String selectRoomType, String checkIn, String checkOut, String noOfRoom, String noOfAdults, String noOfChildren) {
	   //select all field
		selectVisibleText(getDdnState(), selectState);
		selectVisibleText(getDdnCity(), selectCity);
		roomType(selectRoomType);
	    insertByJavascript(getTxtCheckin(), checkIn);
	    insertByJavascript(getTxtCheckout(), checkOut);
	    selectVisibleText(getDdnNoOfRooms(), noOfRoom);
	    selectVisibleText(getDdnNoOfAdults(), noOfAdults);
	    insertValues(getTxtNoOfChild(), noOfChildren);
	    frameElement(getFrameSearch());
	    btnClick(getBtnSearch());
	    
		
	 }
	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to select mandatory fields in explore hotel page
	 * @param selectState,selectCity,checkIn,checkOut,noOfRoom and noOfAdults should be passed as a String
	 */
	public void exploreHotel(String selectState, String selectCity, String checkIn, String checkOut, String noOfRoom, String noOfAdults) {
		//select mandatory field
		selectVisibleText(getDdnState(), selectState);
		selectVisibleText(getDdnCity(), selectCity);
		insertByJavascript(getTxtCheckin(), checkIn);
	    insertByJavascript(getTxtCheckout(), checkOut);
	    selectVisibleText(getDdnNoOfRooms(), noOfRoom);
	    selectVisibleText(getDdnNoOfAdults(), noOfAdults);
	    frameElement(getFrameSearch());
	    btnClick(getBtnSearch());
		   
	}
	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to click search button wihtout entering any field inexplore hotel page
	 */

	
	public void exploreHotel() {
		//without selecting any field
		 frameElement(getFrameSearch());
		    btnClick(getBtnSearch());
	}
	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to get state error message
	 * @return Which will return actStateErrorMsg as a String
	 */

	public String stateErrorMsg() {

		String actStateErrorMsg = getTextData(getErrorMsgState());
		return actStateErrorMsg;
		
	}
	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to get city error message
	 * @return Which will return actCityErrorMsg as a String
	 */

	
	public String cityErrorMsg() {

		String actCityErrorMsg = getTextData(getErrorMsgCity());
		return actCityErrorMsg;
	
	}
	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to get checkin error message
	 * @return Which will return actCheckinErrorMsg as a String
	 */

	public String checkinErrorMsg() {

		String actCheckinErrorMsg = getTextData(getErrorMsgCheckin());
		return actCheckinErrorMsg;
		
	
	}
	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to get checkout error message
	 * @return Which will return actCheckoutErrorMsg as a String
	 */

	public String checkoutErrorMsg() {

		String actCheckoutErrorMsg = getTextData(getErrorMsgCheckout());
		return actCheckoutErrorMsg;
		
	}
	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to get noOfRooms error message
	 * @return Which will return actNoOfRoomsErrorMsg as a String
	 */

	public String noOfRoomsErrorMsg() {
		
		String actNoOfRoomsErrorMsg = getTextData(getErrorMsgNoOfRooms());
		return actNoOfRoomsErrorMsg;

	}
	/**
	 * @author Dharani
	 * @since 12/05/2023
	 * @see This method is used to get noOfAdults error message
	 * @return Which will return actNoOfAdultsErrorMsg as a String
	 */

	
     public String noOfAdultsErrorMsg() {
		
		String actNoOfAdultsErrorMsg = getTextData(getErrorMsgNoOfAdults());
		return actNoOfAdultsErrorMsg;

     }
     /**
 	 * @author Dharani
 	 * @since 12/05/2023
 	 * @see This method is used to select roomType
 	 * @param selectRoomType should be passed as a String
 	 */

	public void roomType(String selectRoomType) {
		
		boolean b = selectRoomType.contains("/");
		if (b) {
			String[] x = selectRoomType.split("/");
			for (String y : x) {	
			selectVisibleText(getDdnRoomType(), y);
			}
			
		} else {
			selectVisibleText(getDdnRoomType(), selectRoomType);
		}

		
	}
	public void navigateToMyBookingFromExploreHotel() {
          btnClick(getClkUserWelcome());
          btnClick(getClkMyAccpunt());
	}
}
