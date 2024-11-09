package pages;

public class LandingPage extends BasePage {
    
    private String sectionLink = "//div[@class='left-menu desktop']//a[normalize-space()='%s' and @href]";
    //div[@class='left-menu desktop']//a[@title='Mylf of the Month'][normalize-space()='Mylf of the Month']
    private String buttonAge = "//button[@id='enter-verification-btn']";
    private String searchButtonInMenu = "//div[@class='navmenu-item search']";
    private String searchBox = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]";

    public LandingPage(){
        super(driver);
    }

    public void navigateToTeamSkeet(){
        driver.manage().window().maximize();
        navigationTo("https://www.mylf.com/");
    }

    public void confirmAgeButton(){
        clickElement(buttonAge);
    }

    public void clickOnSectionNavigationBar(String section){
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }

    public void openSearchField(){
        clickElement(searchButtonInMenu);
    }

    public void entersearchCriteria(String criteria){
        write(searchBox, criteria);
    }
}
