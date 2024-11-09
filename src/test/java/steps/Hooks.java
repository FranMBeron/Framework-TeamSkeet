package steps;

import org.junit.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.Scenario;
import pages.BasePage;

public class Hooks extends BasePage {

    public Hooks(){
        super(driver);
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            scenario.log("Scenario failing, please refer to the image below this message");
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot of the error");
        }
    }

    
}
