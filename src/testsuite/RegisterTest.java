package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        String expectedMessage = "Register";

        String actualMessage = driver.findElement(By.xpath("//div[@class='page-title']")).getText();

        //Validate actual and expected message
        Assert.assertEquals("Register Not Displayed", expectedMessage, actualMessage);
    }


    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //find register link and click on register link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        //find gender radio button link and click on gender radio button link
        WebElement genderRadio = driver.findElement(By.xpath("//input[@id='gender-female']"));
        genderRadio.click();
        //find firstName  link and click on first name link
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Bella");
        //find lastName  link and click on last name link
        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Shah");
        // find the date of birth
        Select day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        Select dayOfBirth = new Select(driver.findElement(By.name("DateOfBirthDay")));
        dayOfBirth.selectByValue("5");
        // find the month of birth
        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        Select monthOfBirth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        monthOfBirth.selectByValue("9");
        // find the year of the birth
        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        Select yearOfBirth = new Select(driver.findElement(By.name("DateOfBirthYear")));
        yearOfBirth.selectByValue("1982");
        // find the email field element
        WebElement emailAddress = driver.findElement(By.xpath("//input[@id='Email']"));
        emailAddress.sendKeys("shahbella55@gmail.com");
        // find the password field element
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Bella123");
        // find the confirm password field element
        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("Bella123");
        // find the register button and the click on the register link
        WebElement registerBtn = driver.findElement(By.id("register-button"));
        registerBtn.click();
        // this message from requirement
        String expectedMessage = "Your registration completed";
        // this message from requirement
        String actualMessage = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();

        //Validate actual and expected message
        Assert.assertEquals("Successful Registration Message Not Displayed", expectedMessage, actualMessage);

    }

    @After
    //close the driver
    public void tearDown() {
        closeBrowser();
    }
}

