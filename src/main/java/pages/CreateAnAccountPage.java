package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAnAccountPage extends BasePage {

    @FindBy(xpath = "//*[@id='email_create']")
    WebElement emailAddressFieldInput;

    @FindBy(xpath = "//*[@id='SubmitCreate']")
    WebElement createAnAccountButton;

    @FindBy(xpath = "//*[contains(text(),'Your personal information')]")
    WebElement yourPersonalInfoLabel;

    @FindBy(xpath = "//*[@id='customer_firstname']")
    WebElement fieldYourFirstName;

    @FindBy(xpath = "//*[@id='submitAccount']")
    WebElement registrationButton;

    @FindBy(xpath = "//*[@id='center_column']//ancestor::*[contains(text(),'firstname')]")
    WebElement errorTextEmptyFieldFirstname;

    @FindBy(xpath = "//*[@id='passwd']")
    WebElement fieldPassword;

    @FindBy(xpath = "//*[@class='alert alert-danger']//ancestor::*[contains(text(),'The Zip/Postal')]")
    WebElement errorTextLongZipcode;

    @FindBy(xpath = "//*[@id='customer_lastname']")
    WebElement fieldYourLastname;

    @FindBy(xpath = "//*[@id='email']")
    WebElement fieildEmail;

    @FindBy(xpath = "//*[@id='firstname']")
    WebElement fieldCompanyFirstname;

    @FindBy(xpath = "//*[@id='lastname']")
    WebElement fieldCompanyLastname;

    @FindBy(xpath = "//*[@id='address1']")
    WebElement fieldYourAddress;

    @FindBy(xpath = "//*[@id='city']")
    WebElement fieldCity;

    @FindBy(xpath = "//*[@id='id_state']//ancestor::*[contains(text(),'Arizona')]")
    WebElement fieldState;

    @FindBy(xpath = "//*[@id='postcode']")
    WebElement fieldZipCode;

    @FindBy(xpath = "//*[@id='id_country']//ancestor::*[contains(text(),'United State')]")
    WebElement fieldCountry;

    @FindBy(xpath = "//*[@id='phone_mobile']")
    WebElement fieldMobPhone;

    @FindBy(xpath = "//*[@id='alias']")
    WebElement fieldAssignAddress;

    @FindBy(xpath = "//*[@id='my-account']")
    WebElement myAccountTab;

    @FindBy(xpath = "//*[@id='alias']")
    WebElement textInFieldAssignAnAddress;

    public CreateAnAccountPage(WebDriver driver) {
        super(driver);
    }

    public void fillInEmailAndClickCreateAccountBtn(String emailAddress) {
        emailAddressFieldInput.sendKeys(emailAddress);
        createAnAccountButton.click();
    }

    public void inputTextInFormFirstNameAndClickRegistr(String firstName) {
        fieldYourFirstName.sendKeys(firstName);
        registrationButton.click();
    }

    public String getEmptyFirstnameText() {
        return errorTextEmptyFieldFirstname.getText();
    }

    public void inputShortPswrdInField(String zipCode) {
        fieldZipCode.sendKeys(zipCode);
        registrationButton.click();
    }

    public String getShortPswrdInField() {
        return errorTextLongZipcode.getText();
    }

    public void inputTextInRequiredFieldsFormAndReg(String yourFirstName, String yourLastName, String passwordField,
                                                    String firstNameCompany, String lastNameCompany,
                                                    String addressCompany, String city, String zipCode,
                                                    String phoneNumber, String assignCompanyName) {
        fieldYourFirstName.sendKeys(yourFirstName);
        fieldYourLastname.sendKeys(yourLastName);
        fieildEmail.click();
        fieldPassword.sendKeys(passwordField);
        fieldCompanyFirstname.sendKeys(firstNameCompany);
        fieldCompanyLastname.sendKeys(lastNameCompany);
        fieldYourAddress.sendKeys(addressCompany);
        fieldCity.sendKeys(city);
        fieldState.click();
        fieldZipCode.sendKeys(zipCode);
        fieldCountry.getText();
        fieldMobPhone.sendKeys(phoneNumber);
        textInFieldAssignAnAddress.clear();
        fieldAssignAddress.sendKeys(assignCompanyName);
        registrationButton.click();
    }

    public boolean isMainStorePageOpened() {
        return myAccountTab.isDisplayed();
    }
}