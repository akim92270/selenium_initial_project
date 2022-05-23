package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driver;

public class Task3 {
    public static void main(String[] args) {

        //Task-3
        /*
        Test Case 3: Validate ComfyElite Contact Us page "Contact Us" "SEND US A MESSAGE" form headings
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And user should be able to see heading2 as "Contact Us"
        And user should be able to see heading4 as "SEND US A MESSAGE"
         */

        WebDriver driver3 = Driver.getDriver();
        driver3.get("https://comfyelite.com/");

        WebElement contact3 = driver3.findElement(By.xpath("//a[@data-page='c98d6494-baf6-4116-a4b3-59b14bdd9ff1']"));
        contact3.click();

        WebElement heading_2 = driver3.findElement(By.xpath("//h2[@data-ux='SectionHeading']"));
        WebElement heading4 = driver3.findElement(By.xpath("//h4[@data-aid='CONTACT_FORM_TITLE_REND']"));

        System.out.println(heading_2.isDisplayed() && heading_2.getText().equals("Contact Us") ? "Heading2 is validated and PASSED" : "Heading2 is not validated and FAILED");
        System.out.println(heading4.isDisplayed() && heading4.getText().equals("SEND US A MESSAGE") ? "Heading4 is validated and PASSED" : "Heading4 is not validated and FAILED");

        Driver.quitDriver();
    }
}
