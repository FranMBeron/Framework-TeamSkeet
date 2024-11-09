package pages;

public class ResultsPage extends BasePage{

    private String firstResult = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/img[1]";

    public ResultsPage(){
        super(driver);
    }

    public void clickFirstResult(){
        clickElement(firstResult);
    }

    
}
