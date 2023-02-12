package tests.SmokeTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PositiveLoginTest {


//   1. Launch browser
//  2. Navigate to url 'http://automationexercise.com'
//           3. Verify that home page is visible successfully
//  4. Click on 'Signup / Login' button
//  5. Verify 'Login to your account' is visible
//  6. Enter correct email address and password
//  7. Click 'login' button
//  8. Verify that 'Logged in as username' is visible
//  9. Click 'Delete Account' button
// 10. Verify that 'ACCOUNT DELETED!' is visible


public void PositiveLoginTest(){

    PageFactory.initElements(Driver.getDriver(),this);

}

@FindBy(name = "email")
   public WebElement LoginEmailBtn;


    @FindBy(name = "password")
    public WebElement LoginPasswordBtn;





















}
