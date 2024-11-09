package pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    protected static WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
    static{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public static void navigationTo(String url) {
        driver.get(url);
    }

    public static void closeBrowser(){
        driver.quit();
    }

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        Find(locator).click();
    }

    public void write(String locator, String keysToSend){
        Find(locator).sendKeys(keysToSend);
    }

    public void selectFromDropdownByValue(String locator, String value){
        Select dropdown = new Select(Find(locator));

        dropdown.selectByValue(value);
    }

    public List<String> getDropDownValues(String locator){
        Select dropdown = new Select(Find(locator));

        List<WebElement> dropdownOptions = dropdown.getOptions();
        List<String> values = new ArrayList<>();

        for (WebElement option : dropdownOptions){
            values.add(option.getText());
        }

        return values;
    }

    public String textFromElement(String Locator){
        return Find(Locator).getText();
    }

    public boolean elementEnable(String locator){
        return Find(locator).isEnabled();
    }

    public boolean elementDisplayed(String locator){
        return Find(locator).isDisplayed();
    }


    //Possible functions for Video Testing using JavascriptExecutor

    public void playVideo(String videoLocator){
        WebElement video = Find(videoLocator);
        js.executeScript("arguments[0].play();", video);
    }

    public void pauseVideo(String videoLocator){
        WebElement video = Find(videoLocator);
        js.executeScript("arguments[0].pause();", video);
    }

    public boolean isVideoPlaying(String videoLocator){
        WebElement video = Find(videoLocator);
        return (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].paused === false;", video);
    }

    public boolean isVideoEnded(String videoLocator){
        WebElement video = Find(videoLocator);
        return (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].ended;", video);
    }

    public double getCurrentTime(String videoLocator){
        WebElement video = Find(videoLocator);
        return (Double) ((JavascriptExecutor) driver).executeScript("return arguments[0].currentTime;", video);
    }

    public void seekToEnd(String videoLocator){
        WebElement video = Find(videoLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].currentTime === arguments[0].duration;", video);
    }

    public void muteVideo(String videoLocator){
        WebElement video = Find(videoLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].currentTime === arguments[0].mute = true;", video);
    }

    public void unmuteVideo(String videoLocator){
        WebElement video = Find(videoLocator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].currentTime === arguments[0].mute = false;", video);
    }
}
