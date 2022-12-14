package com.website.scripts;
import java.io.IOException;
import org.testng.annotations.Test;
import com.website.constants.AutomationConstants;
import com.website.excelutilities.Excelutility;


import com.website.login.Loginpage3;

import org.openqa.selenium.By;
import org.testng.Assert;




	public class TC_035 extends TestBase {
		Loginpage3 objLogin3;
		@Test(priority=1)
	    public void verifyValidLogin() throws IOException, InterruptedException {
	    objLogin3 = new Loginpage3(driver);
	    Thread.sleep(5000);
	    objLogin3.click_Coursebutton();
	    Thread.sleep(5000);
	    objLogin3.click_SoftwareTestingbutton();
	    Thread.sleep(5000);
	    objLogin3.click_APPLY_NOW_button();
	    Thread.sleep(5000);
	    String name = Excelutility.getCellData(9, 0);
	   String email = Excelutility.getCellData(9, 1);
	    String number = Excelutility.getCellData(9, 2);
	   
	    objLogin3.name_Field(name);
	    Thread.sleep(5000);
	    objLogin3.email_Field(email);
	    Thread.sleep(5000);
	    objLogin3.number_Field(number);
	    Thread.sleep(5000);
	    objLogin3.click_Registerbutton();
	    Thread.sleep(5000);
	    driver.switchTo( ).alert( ).accept();
	    Thread.sleep(5000);
	    
	    String expectedTitle =AutomationConstants.HOMEPAGETITLE;
	    String actualTitle =driver.getTitle();
	    Assert.assertEquals(expectedTitle,actualTitle);
	  
	    }



	}



