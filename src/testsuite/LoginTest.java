package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // Find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //Find the welcome text Element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);
        //Validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        WebElement emailField = driver.findElement(By.id("Email"));
        // sending email to email field element
        emailField.sendKeys("shahbella55@gmail.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        // sending password to password field element
        passwordField.sendKeys("Bella123");
        //find log in link and click login link
        WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginBtn.click();
        // find the logout link and click logout link
        WebElement logoutLink = driver.findElement(By.linkText("Log out"));
        logoutLink.click();

    }

    @Test
    public void verifyTheErrorMessage() {
        // Find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        WebElement emailField = driver.findElement(By.id("Email"));
        // sending email to email field element
        emailField.sendKeys("prime123@gmail.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        // sending password to password field element
        passwordField.sendKeys("prime123");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        //This message from requirement
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";

        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();

        //Validate actual and expected message
        Assert.assertEquals("Error Message Not Displayed", expectedErrorMessage, actualErrorMessage);
    }

    @After
    //close the driver
    public void tearDown() {
        closeBrowser();
    }


}


