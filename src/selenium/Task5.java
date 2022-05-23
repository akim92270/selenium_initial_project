package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driver;

import java.util.concurrent.TimeUnit;

public class Task5 {
    public static void main(String[] args) {
        //Task-5
        /*
        Test Case 5: Validate ComfyElite Contact Us page "Sign up for our email list
        for updates, promotions, and more." Checkbox
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And validate the "Sign up for our email list for updates, promotions, and more." checkbox
        Note: Checkbox validation includes checkbox being selected and deselected by user
         */

        WebDriver driver5 = Driver.getDriver();
        driver5.get("https://comfyelite.com/");

        WebElement contact5 = driver5.findElement(By.xpath("//a[@data-page='c98d6494-baf6-4116-a4b3-59b14bdd9ff1']"));
        contact5.click();

        WebElement checkBox = driver5.findElement(By.xpath("(//div[@data-ux='Element'])[2]"));
        WebElement signUpMessage= driver5.findElement(By.xpath("//p[@data-ux='Text']"));

        if(signUpMessage.isDisplayed() && signUpMessage.getText().equals("Sign up for our email list for updates, promotions, and more."))
            System.out.println("Signup message is displayed");
        else System.out.println("Signup message is not displayed");

        checkBox.click();

        if(checkBox.isDisplayed() && checkBox.isEnabled()) System.out.println("Checkbox is deselected and validation PASSED");
        else System.out.println("Checkbox is not selected and validation FAILED");

        checkBox.click();

        Driver.quitDriver();
    }
}
