package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Jeyachandran on 4/17/2019.
 * This page factory contains all the webelements present in the facebook signup page which
 * we use in our program
 */
public class SignupPF {

    WebDriver driver;

    public SignupPF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "firstname")
    private WebElement firstname;
    public WebElement firstname() {
        return firstname;
    }

    @FindBy(name = "lastname")
    private WebElement lastname;
    public WebElement lastname() {
        return lastname;
    }


    @FindBy(xpath = "//input[contains(@name,'reg_email')]")
    private WebElement email;
    public WebElement email() {
        return email;
    }

    @FindBy(xpath = "//input[contains(@name,'reg_passwd')]")
    private WebElement pswd;
    public WebElement pswd() {
        return pswd;
    }

    @FindBy(name = "birthday_day")
    private WebElement birthday;
    public WebElement birthday() {
        return birthday;
    }

    @FindBy(name = "birthday_month")
    private WebElement birthmonth;
    public WebElement birthmonth() {
        return birthmonth;
    }

    @FindBy(name = "birthday_year")
    private WebElement birthyear;
    public WebElement birthyear() {
        return birthyear;
    }

    @FindBy(xpath = "//input[@type='radio'][@value='1']")
    private WebElement sex_female;
    public WebElement sex_female() {
        return sex_female;
    }

    @FindBy(xpath = "//input[@type='radio'][@value='2']")
    private WebElement sex_male;
    public WebElement sex_male() {
        return sex_male;
    }

    @FindBy(xpath = "//input[contains(@name,'reg_email_confirmation')]")
    private WebElement reenteremail;
    public WebElement reenteremail() {
        return reenteremail;
    }

    @FindBy(name = "websubmit")
    private WebElement submit;
    public WebElement submit() {
        return submit;
    }

    @FindBy(xpath = "//div[@class='_6qfu _5lxt'][contains(text(),'Account Settings')]")
    private WebElement optionsdpdwn;
    public WebElement optionsdpdwn() {
        return optionsdpdwn;
    }

    @FindBy(xpath = "//span[@class='_54nh'][contains(text(),'Log Out')]")
    private WebElement logout;
    public WebElement logout() {
        return logout;
    }

    @FindBy(xpath = "//button[@value='1'][contains(text(),'Log Out')]")
    private WebElement confirmlogout;
    public WebElement confirmlogout() {
        return confirmlogout;
    }

}
