package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pagefactory.SignupPF;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;



/**
 * Created by Jeyachandran on 4/17/2019.
 * This class contains the step definition mapped to the scenarios from the feature file
 */
public class SignUpFacebookAccount {

    public static WebDriver driver;
    SignupPF signupdriver;
    String randomyear;
    String randommonth;
    String randomday;


    @Given("I Launch a web browser")
    public void Launchwebbrowser()
    {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        //Create prefs map to store all preferences
        Map<String, Object> prefs = new HashMap<String, Object>();

        //Put this into prefs map to switch off browser notification
        prefs.put("profile.default_content_setting_values.notifications", 2);

        //Create chrome options to set this prefs
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        //Now initialize chrome driver with chrome options which will switch off this browser notification on the chrome browser
        driver = new ChromeDriver(options);

        //driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        signupdriver = new SignupPF(driver);

   }

    @And("Enter the first set of personal details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"")
    public void EnterSection1PersonalDetails(String EnterFirstname, String EnterSurName, String EnterEmailaddress,String EnterPass)  {
        String fname;
        String lname;
        String email;
        String pswd;

        fname = firstnamegenerator();
        lname = lastnamegenerate();
        email = emailgenerate();
        pswd = passwordgenerate();

        dategenerator();

        if (EnterFirstname.contains("Yes"))
        {
            signupdriver.firstname().sendKeys(fname);
        }

        if (EnterSurName.contains("Yes"))
        {
            signupdriver.lastname().sendKeys(lname);
        }

        if (EnterEmailaddress.contains("Yes"))
        {
            signupdriver.email().sendKeys(email);
        }

        if (EnterPass.contains("Yes"))
        {
            signupdriver.pswd().sendKeys(pswd);
        }

        signupdriver.reenteremail().sendKeys(email);
    }

    @And("Enter the second set of personal details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"")
    public void EnterSection2PersonalDetails(String EnterBirthDay, String EnterBirthMonth,String EnterBirthYear)
    {
        Boolean gender;
        gender = getRandomBoolean();

        if (EnterBirthDay.contains("Yes"))
        {
            Select bday = new Select(signupdriver.birthday());
            bday.selectByValue(randomday);
        }

        if (EnterBirthMonth.contains("Yes")) {
            Select bmonth = new Select(signupdriver.birthmonth());
            bmonth.selectByValue(randommonth);
        }

        if (EnterBirthYear.contains("Yes"))
        {
            Select byear = new Select(signupdriver.birthyear());
            byear.selectByValue(randomyear);
        }

        if(gender.equals(true))
        {
            signupdriver.sex_female().click();

        }else
        {
            signupdriver.sex_male().click();
        }
    }

    @Then("Signup for the facebook application")
    public void signup() throws InterruptedException {
        signupdriver.submit().click();
        //This wait is particularly made so that we can see the next page in real time, else
        // it will quickly go to next page and log out as per the next scenario
        Thread.sleep(7000);
    }

    @Then("I close the web browser")
    public void closebrowser()
    {
        driver.quit();
    }

    //used for random date generation
    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }

    //Used to generate meaningful unisex firstname
    public String firstnamegenerator(){
        String[] Firstname = { "Addison", "Ash", "Bobbie", "Brook", "Corey",
                "Dakota", "Eli", "Harper", "Jamie", "Jesse", "Kennedy", "Peyton", "Rudy", "Stevie",
                "Tanner", "Tyler", "West", "Winter", "Kelly", "Leslie", "Shawn", "Alexis", "Taylor",
                "Terry", "Willie" };
        Random rand = new Random();
        return Firstname[rand.nextInt(Firstname.length)];
    }

    public String lastnamegenerate(){
        String[] Lastname = { "Sullivan", "Walker", "Sullivan", "Stone", "Penn",
                "Parker", "Miller", "Lennox", "Jennings", "Hendrix", "Easton", "Dixon", "Cooper", "Channing",
                "Brady", "Carson", "Beckett", "Adler", "Sawyer", "Shaw", "Stone", "Wiley", "Wilson",
                "Marly", "Lennox" };
        Random rand = new Random();
        return Lastname[rand.nextInt(Lastname.length)];
    }

    public String emailgenerate()
    {
        String randomemail = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder strbuidr = new StringBuilder();
        Random rnd = new Random();
        while (strbuidr.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * randomemail.length());
            strbuidr.append(randomemail.charAt(index));
        }
        String emailgen = strbuidr.toString()+"@gmail.com";
        return emailgen;
    }

    public String passwordgenerate()
    {
        Random rnd = new Random();
        String randompass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder strbuidrpass = new StringBuilder();
        while (strbuidrpass.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * randompass.length());
            strbuidrpass.append(randompass.charAt(index));
        }
        return strbuidrpass.toString();
    }

    public void dategenerator()
    {
        GregorianCalendar gc = new GregorianCalendar();
        int year = randBetween(1950, 1992);
        gc.set(gc.YEAR, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        this.randomyear = Integer.toString(gc.get(gc.YEAR));
        this.randommonth = Integer.toString((gc.get(gc.MONTH) + 1));
        this.randomday = Integer.toString(+gc.get(gc.DAY_OF_MONTH));
    }

    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }
}
