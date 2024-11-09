package steps;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.LandingPage;
import pages.ResultsPage;
import pages.VideoPage;

public class TeamskeetSteps {

    LandingPage landingPage = new LandingPage();
    ResultsPage resultsPage = new ResultsPage();
    VideoPage videoPage = new VideoPage();


    @Given("the user navigates to www.mylf.com")
    public void navigateToTST(){
        landingPage.navigateToTeamSkeet();
    }

    @When("click confirms the age")
    public void confirmAge(){
        landingPage.confirmAgeButton();
    }

    @When("I go to {} using the navigation bar")
    public void navigationBarUse(String section){
        landingPage.clickOnSectionNavigationBar(section);
    }

    @When("I search for blondes")
    public void searchVideo(){
        landingPage.openSearchField();
        landingPage.entersearchCriteria("blondes");
    }

    @Then("select the first video")
    public void selectFVideo(){
        resultsPage.clickFirstResult();
    }

    @Then("Check the firts actresses link name is ready to interact and the text is correct")
    public void assertsNOne(){
        Assert.assertEquals("Katie Morgan", videoPage.checkTextNameOne());
        Assert.assertTrue("is available to interact with the text link button", videoPage.checkEnableNameOne());
    }

    @Then("Check the second actresses link name is ready to interact and the text is correct")
    public void assertsNTwo(){
        Assert.assertEquals("Rachael Cavalli", videoPage.checkTextNameTwo());
        Assert.assertTrue("is available to interact with the text link button", videoPage.checkEnableNameTwo());
    }

    @Then("Check the third actresses link name is ready to interact and the text is correct")
    public void assertsNThree(){
        Assert.assertEquals("Brandi Love", videoPage.checkTextNameThree());
        Assert.assertTrue("is available to interact with the text link button", videoPage.checkEnableNameThree());
    }

    @Then("Check the fourth actresses link name is ready to interact and the text is correct")
    public void assertsNFour(){
        Assert.assertEquals("Lolly Dames", videoPage.checkTextNameFour());
        Assert.assertTrue("is available to interact with the text link button", videoPage.checkEnableNameFour());
    }

}
