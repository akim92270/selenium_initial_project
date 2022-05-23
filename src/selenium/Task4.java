package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Driver;

import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        //Task-4
        /*Test Case 4: Validate ComfyElite Contact Us page "SEND US A MESSAGE" form
        Given user navigates to “https://comfyelite.com/”
        When user clicks on “CONTACT US” link in the header
        Then user should be navigated to “CONTACT US” page
        And validate "First Name" input box
        And validate "Last Name" input box
        And validate "Email" input box
        And validate "Message" input box
        NOTE: Input validation includes input being displayed and user being able send keys to input box. It also requires validating the given labels and placeholders
         */

        WebDriver driver4 = Driver.getDriver();
        driver4.get("https://comfyelite.com/");

        WebElement contact4 = driver4.findElement(By.xpath("//a[@data-page='c98d6494-baf6-4116-a4b3-59b14bdd9ff1']"));
        contact4.click();

        WebElement firstName = driver4.findElement(By.xpath("//input[@data-aid='First Name']"));
        WebElement lastName = driver4.findElement(By.xpath("//input[@data-aid='Last Name']"));
        WebElement email = driver4.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));
        WebElement firstNameText = driver4.findElement(By.xpath("(//label[@data-ux='InputFloatLabelLabel'])[1]"));
        WebElement lastNameText = driver4.findElement(By.xpath("(//label[@data-ux='InputFloatLabelLabel'])[2]"));
        WebElement emailText = driver4.findElement(By.xpath("(//label[@data-ux='InputFloatLabelLabel'])[3]"));

        WebElement message = driver4.findElement(By.tagName("textarea"));

        firstName.sendKeys("a");
        lastName.sendKeys("k");
        email.sendKeys("ak@gmail.com");
        message.sendKeys("hello world");

        System.out.println(firstName.isDisplayed() ? "First name input box is displayed, validation PASSED" : "First Name input box is displayed, validation FAILED");
        System.out.println(lastName.isDisplayed() ? "Last name input box is displayed, validation PASSED" : "Last Name input box is displayed, validation FAILED");
        System.out.println(email.isDisplayed() ? "Email input box is displayed, validation PASSED" : "Email input box is displayed, validation FAILED");
        System.out.println(message.isDisplayed() ? "Message input box is displayed, validation PASSED" : "Message input box is displayed, validation FAILED");

        System.out.println(firstName.getAttribute("value").equals("a") ? "First name message validation PASSED" : "First name message validation FAILED");
        System.out.println(lastName.getAttribute("value").equals("k") ? "Last name message validation PASSED" : "Last name message validation FAILED");
        System.out.println(email.getAttribute("value").equals("ak@gmail.com") ? "Email message validation PASSED" : "Email message validation FAILED");
        System.out.println(message.getText().equals("hello world") ? "Message validation PASSED" : "Message validation FAILED");

        System.out.println(firstNameText.getText().equals("First Name*") ? "First Name label: PASSED" : "First Name label: FAILED");
        System.out.println(lastNameText.getText().equals("Last Name*") ? "Last Name label: PASSED" : "Last Name label: FAILED");
        System.out.println(emailText.getText().equals("Email*") ? "Email label: PASSED" : "Email label: FAILED");
        System.out.println(message.getAttribute("placeholder").equals("Message*") ? "Message label: PASSED" : "Message label: FAILED");

        Driver.quitDriver();
    }
}
