package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

public class HomepagePageClass {

    Actions actions = new Actions(Driver.getDriver());
    public HomepagePageClass() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(partialLinkText = "Signup / Login")
    public WebElement signupLoginBtn;


    @FindBy(xpath = "//div//h2")
    public WebElement signupLoginText;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement nameInput;

    @FindBy(xpath = "//div//h2")
    public WebElement accountInformationText;

    @FindBy(xpath = " //div//label[@for='id_gender2']")
    public WebElement mrsRadioBtn;

    @FindBy(id= "password")
    public WebElement password;

    @FindBy(id= "days")
    public WebElement daysDropDown;

    @FindBy(id= "months")
    public WebElement  monthsDropDown;

    @FindBy(id= "years")
    public WebElement  yearsDropDown;

    @FindBy(xpath= "(//div//span//input)[3]")
    public WebElement  newsLetterCheckbox;

    @FindBy(id= "optin")
    public WebElement  receiveCheckbox;

    @FindBy(id= "first_name")
    public WebElement addressInformationFirstName;

    @FindBy(id= "country")
    public WebElement countryDropDown;

    @FindBy(id= "state")
    public WebElement stateInput;

    @FindBy(xpath= "//div//h2")
    public WebElement accountCreatedText;

    @FindBy(partialLinkText= "Continue")
    public WebElement continueBtn;

    @FindBy(xpath= "//li//a//i[@class='fa fa-user']")
    public WebElement loggedText;

    @FindBy(xpath= "(//div//ul//li//a)[5]")
    public WebElement deleteAccountBtn;

    @FindBy(xpath= "//div//h2")
    public WebElement deleteAccountText;



    @FindBy(xpath = "//div//a[@class='btn btn-primary']")
    public WebElement deleteAccountContinue;


    public void signupLoginText() {

        nameInput.sendKeys(ConfigReader.getProperty("correct_name") + Keys.TAB );

        actions.sendKeys(ConfigReader.getProperty("correct_Email") + Keys.TAB + Keys.ENTER).perform();

    }

    public void accountInformation() {

        mrsRadioBtn.click();

 password.sendKeys(ConfigReader.getProperty("correct_password") + Keys.TAB);

        Select select=new Select(daysDropDown);

        select.selectByValue("13");

        select=new Select(monthsDropDown);

        select.selectByValue("7");

        select=new Select(yearsDropDown);

        select.selectByValue("2000");

        JSUtils.scrollDownByJS();

        newsLetterCheckbox.click();

        receiveCheckbox.click();


    }

    public void AddressInformation() {

        Faker faker=new Faker();

        addressInformationFirstName.sendKeys(faker.name().firstName() + Keys.TAB
                + faker.name().lastName() + Keys.TAB
        +faker.company().name() + Keys.TAB
        +faker.address().fullAddress() + Keys.TAB
        +faker.address().city() + Keys.TAB);



        Select select=new Select(countryDropDown);
        JSUtils.scrollDownByJS();

        select.selectByValue("Canada");

        stateInput.sendKeys(faker.address().state() + Keys.TAB
                + faker.address().cityName() + Keys.TAB
                +faker.address().zipCode() + Keys.TAB
                +faker.phoneNumber() + Keys.TAB +Keys.ENTER);



    }





}
