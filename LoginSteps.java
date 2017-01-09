package Steps;



import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

import java.util.List;

/**
 * Created by Aviad Sar-Shalom on 08/01/2017.
 */
public class LoginSteps {

    WebDriver driver=new FirefoxDriver();

    @Given("^Navigate to Paper cut Website$")
    public void navigateToPaperCutWebsite() throws Throwable {
        driver.get("http://views.papercut.com");
        throw new PendingException();
    }

    @When("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        driver.findElement(By.linkText("Log in")).click();
        throw new PendingException();
    }


    @Then("^I see Dashboard page$")
    public void iSeeDashboardPage() throws Throwable {
        assertEquals(driver.findElement(By.id("logo-views")).getText(),"PaperCut Views");
        throw new PendingException();
    }

    @Then("^Email is on Dashboard right upper corner$")
    public void emailIsOnDashboardRightUpperCorner() throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/ul/li[2]/a/div/span")).isDisplayed());
        throw new PendingException();
    }

    @Then("^Label Printer with Error and A(\\d+) Printer with Warning and Reception printer in online$")
    public void labelPrinterWithErrorAndAPrinterWithWarningAndReceptionPrinterInOnline(int arg0) throws Throwable {
        Assert.assertTrue(driver.findElement(By.className("device fault")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.className("device caution")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.className("device online")).isDisplayed());
        throw new PendingException();
    }

    @Then("^I see number of page this month$")
    public void iSeeNumberOfPageThisMonth() throws Throwable {
        Assert.assertTrue(driver.findElement(By.id("pagessummary-monthlytotal")).isDisplayed());
        throw new PendingException();
    }

    @When("^I Cick See forecast Button$")
    public void iCickSeeForecastButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"forecasts\"]/div/div/div[1]/div[1]/div/div[2]/button")).click();
        throw new PendingException();
    }

    @Then("^I see numbers for HP color LaserJet Pro MFP M(\\d+) PCL(\\d+) printer$")
    public void iSeeNumbersForHPColorLaserJetProMFPMPCLPrinter(int arg0, int arg1) throws Throwable {
        Assert.assertEquals(driver.findElement(By.className("model")).getText(),"HP Color LaserJet Pro MFP M277 PCL6");
        throw new PendingException();
    }

    @When("^I change Slider to (\\d+) days$")
    public void iChangeSliderToDays(int arg0) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[2]/div[1]/div/div[1]/div/ul/li[2]")).click();
        throw new PendingException();
    }

    @Then("^I see forecast numbers for the same printer$")
    public void iSeeForecastNumbersForTheSamePrinter() throws Throwable {
        System.out.println(driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[2]/div[1]/div/div[2]/div/div/table/tbody/tr[2]/td[2]")).getText());
        driver.findElement(By.xpath("//*[@id=\"page\"]/div/div[2]/div[1]/div/header/i")).click();
        throw new PendingException();
    }

    @Then("^I click Sign out$")
    public void iClickSignOut() throws Throwable {
        driver.findElement(By.linkText("Sign Out")).click();
        throw new PendingException();
    }


    @And("^I enter following credentials$")
    public void iEnterFollowingCredentials(DataTable table) throws Throwable {
        List<List<String>> data=table.raw();
        //Enter UserName
        driver.findElement(By.id("Email")).sendKeys(data.get(1).get(0));
        //Enter Password
        driver.findElement(By.id("Passwd")).sendKeys(data.get(1).get(1));
        throw new PendingException();
    }

    @And("^I Click Continue with Google$")
    public void iClickContinueWithGoogle() throws Throwable {
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/ul/li[1]/a/span")).click();
        throw new PendingException();
    }

    @And("^I Click Sign in Button$")
    public void iClickSignInButton() throws Throwable {
        driver.findElement(By.id("signIn")).click();
        throw new PendingException();
    }
}
