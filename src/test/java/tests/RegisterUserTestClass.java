package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterUserPageClass;
import utilities.BaseTestReport;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterUserTestClass extends BaseTestReport {


    RegisterUserPageClass hm = new RegisterUserPageClass();
    @Test
    public void registerUser() {

         extentTest = extentReports.createTest("checkoutPageTest");

        Driver.getDriver().get(ConfigReader.getProperty("Homapage_url"));

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://automationexercise.com/"));

        hm.signupLoginBtn.click();

        Assert.assertTrue(hm.signupLoginText.isDisplayed());

        hm.signupLoginText();

        Assert.assertTrue(hm.accountInformationText.isDisplayed());

    }

    @Test
    public void accountInformationtest() {

        registerUser();

        hm.accountInformation();

        hm.AddressInformation();

        Assert.assertTrue(hm.accountCreatedText.isDisplayed());

        hm.continueBtn.click();

        Driver.getDriver().get("https://automationexercise.com/");

        Assert.assertTrue(hm.loggedText.isDisplayed());

        hm.deleteAccountBtn.click();

        Assert.assertTrue(hm.deleteAccountText.isDisplayed());

        hm.deleteAccountContinue.click();

    }

}
