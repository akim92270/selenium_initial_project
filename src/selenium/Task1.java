package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {

        //Task-1
        /*
        Test Case 1: Validate ComfyElite Contact Us Page heading section
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And user should be able to see ComfyElite logo
        And user should be able to see heading2 as “High quality comfy pillows and accessories for travel, office and home.”
         */

        WebDriver driver1 = Driver.getDriver();

        driver1.get("https://comfyelite.com/");

        WebElement contact = driver1.findElement(By.xpath("//a[@data-page='c98d6494-baf6-4116-a4b3-59b14bdd9ff1']"));
        contact.click();

        WebElement logo = driver1.findElement(By.xpath("//img[@data-ux='ImageLogo']/../.."));
        WebElement heading2 = driver1.findElement(By.xpath("//*[starts-with(@id,'dynamic-tagline-')]"));

        if (logo.isDisplayed()) System.out.println("ComfyElite Logo is displayed, validation, and PASSED");
        else System.out.println("ComfyElite Logo is not displayed, validation FAIL");

        if (heading2.isDisplayed() && heading2.getText().equals("High quality comfy pillows and accessories for travel, office and home."))
            System.out.println("Heading2 is displayed, validated, and PASSED");
        else System.out.println("Heading2 is not displayed, validation FAILED");

        Driver.quitDriver();
    }
}
