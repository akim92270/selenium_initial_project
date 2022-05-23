package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driver;

public class Task6 {
    public static void main(String[] args) {

        //Task-6
        /*
        Test Case 6: Validate ComfyElite Contact Us page "SEND" button
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And validate "SEND" button is displayed and clickable
        And validate button text is displayed as “SEND”
         */

        WebDriver driver6 = Driver.getDriver();
        driver6.get("https://comfyelite.com/");

        WebElement contact6 = driver6.findElement(By.xpath("//a[@data-page='c98d6494-baf6-4116-a4b3-59b14bdd9ff1']"));
        contact6.click();

        WebElement sendButton = driver6.findElement(By.cssSelector("button[data-aid='CONTACT_SUBMIT_BUTTON_REND']"));
        System.out.println(sendButton.isDisplayed() && sendButton.isEnabled() ?
                "Send button is displayed and clickable" : "Send button is not displayed and not clickable");

        System.out.println(sendButton.getText().equals("SEND") ?
                "Send button text is valid" : "Send button text is invalid");

        Driver.quitDriver();
    }
}
