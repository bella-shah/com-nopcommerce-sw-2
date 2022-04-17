package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputersPageSuccessfully() {
        //find the computers tab and click on the computer tab
        WebElement computersTab = driver.findElement(By.partialLinkText("Computers"));
        computersTab.click();
        String expectedMessage = "Computers";

        String actualMessage = driver.findElement(By.xpath("//div[@class='page-title']")).getText();

        //Validate actual and expected message
        Assert.assertEquals("Computers Text not displayed correctly", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //find the electronics  tab and click on the electronics tab
        WebElement electronicsTab = driver.findElement(By.partialLinkText("Electronics"));
        electronicsTab.click();
        String expectedMessage = "Electronics";
        // this message from requirement
        String actualMessage = driver.findElement(By.xpath("//div[@class='page-title']")).getText();

        //Validate actual and expected message
        Assert.assertEquals("Electronics Text not displayed correctly", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //find the apparel tab and click on the apparel  tab
        WebElement apparelTab = driver.findElement(By.partialLinkText("Apparel"));
        apparelTab.click();
        String expectedMessage = "Apparel";

        String actualMessage = driver.findElement(By.xpath("//div[@class='page-title']")).getText();

        //Validate actual and expected message
        Assert.assertEquals("Apparel Text not displayed correctly", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //find the downloads tab and click on the downloads tab
        WebElement downloadsTab = driver.findElement(By.partialLinkText("Digital downloads"));
        downloadsTab.click();
        String expectedMessage = "Digital downloads";

        String actualMessage = driver.findElement(By.xpath("//div[@class='page-title']")).getText();

        //Validate actual and expected message
        Assert.assertEquals("Digital downloads Text not displayed correctly", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //find the books tab and click on the books tab
        WebElement booksTab = driver.findElement(By.partialLinkText("Books"));
        booksTab.click();
        String expectedMessage = "Books";

        String actualMessage = driver.findElement(By.xpath("//div[@class='page-title']")).getText();

        //Validate actual and expected message
        Assert.assertEquals("Books Text not displayed correctly", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //find the jewelery tab and click on the jewelry tab
        WebElement jewelryTab = driver.findElement(By.partialLinkText("Jewelry"));
        jewelryTab.click();
        String expectedMessage = "Jewelry";
        String actualMessage = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        //Validate actual and expected message
        Assert.assertEquals("Jewelry Text not displayed correctly", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //find the gift card tab and click on the gift card tab
        WebElement giftCardTab = driver.findElement(By.partialLinkText("Gift Cards"));
        giftCardTab.click();
        String expectedMessage = "Gift Cards";
        // this message from requirement
        String actualMessage = driver.findElement(By.xpath("//div[@class='page-title']")).getText();
        //Validate actual and expected message
        Assert.assertEquals("Gift Cards Text not displayed correctly", expectedMessage, actualMessage);
    }

    @After
    // close the driver
    public void tearDown() {
        closeBrowser();
    }

}
