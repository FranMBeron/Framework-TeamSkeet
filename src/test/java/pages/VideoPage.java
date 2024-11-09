package pages;


public class VideoPage extends BasePage {
    
    private String ButtonNameOne = "//a[normalize-space()='Katie Morgan' and @href]";
    private String ButtonNameTwo = "//a[normalize-space()='Rachael Cavalli' and @href]";
    private String ButtonNameThree = "//a[normalize-space()='Brandi Love' and @href]";
    private String ButtonNameFour = "//a[normalize-space()='Lolly Dames' and @href]";

    public VideoPage(){
        super(driver);
    }

    //Text Button Verifications

    public String checkTextNameOne(){
        return textFromElement(ButtonNameOne);
    }

    public String checkTextNameTwo(){
        return textFromElement(ButtonNameTwo);
    }

    public String checkTextNameThree(){
        return textFromElement(ButtonNameThree);
    }

    public String checkTextNameFour(){
        return textFromElement(ButtonNameFour);
    }

    //Enable Button Verifications

    public boolean checkEnableNameOne(){
        return elementEnable(ButtonNameOne);
    }

    public boolean checkEnableNameTwo(){
        return elementEnable(ButtonNameTwo);
    }

    public boolean checkEnableNameThree(){
        return elementEnable(ButtonNameThree);
    }

    public boolean checkEnableNameFour(){
        return elementEnable(ButtonNameFour);
    }
}
