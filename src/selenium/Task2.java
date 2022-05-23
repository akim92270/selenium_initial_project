package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driver;

public class Task2 {
    public static void main(String[] args) {

        //Task-2

        /*Test Case 2: Validate ComfyElite Contact Us page "Connect With Us" section
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And user should be able to see heading1 as "Connect With Us"
        And user should be able to see “Facebook” icon and hyperlink reference for it should be “https://www.facebook.com/103179127717601”
        And user should be able to see “Instagram” icon and hyperlink reference for it should be “https://www.instagram.com/comfyelite”
         */

        WebDriver driver2 = Driver.getDriver();

        driver2.get("https://comfyelite.com/");

        WebElement contact2 = driver2.findElement(By.xpath("//a[@data-page='c98d6494-baf6-4116-a4b3-59b14bdd9ff1']"));
        contact2.click();

        WebElement connectWithUs = driver2.findElement(By.xpath("//h1[@data-ux='SectionHeading']"));
        WebElement fbIcon = driver2.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']"));
        WebElement instagram = driver2.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']"));

        if (connectWithUs.getText().equals("Connect With Us") && connectWithUs.isDisplayed())
            System.out.println("Heading1 is displayed, validation PASSED");
        else System.out.println("Heading1 is not displayed, validation FAILED");

        if (fbIcon.isDisplayed() && fbIcon.getAttribute("href").equals("https://www.facebook.com/103179127717601"))
            System.out.println("Facebook logo is displayed, hyperlink works, validation PASSED");
        else System.out.println("Facebook logo is not displayed and hyperlink works, validation FAILED");

        if (instagram.isDisplayed() && instagram.getAttribute("href").equals("https://www.instagram.com/comfyelite"))
            System.out.println("Instagram is displayed, hyperlink works, validation PASSED");
        else System.out.println("Instagram is not displayed, hyperlink works, validation FAILED");

        Driver.quitDriver();
    }
}
