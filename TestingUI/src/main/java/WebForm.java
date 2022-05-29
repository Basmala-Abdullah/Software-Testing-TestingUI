import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends Object{

    private final String FirstName = "Basmala";
    private final String LastName = "Abdullah";
    private final String JobTitle = "Student";

    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(id = "job-title")
    private WebElement job_title;

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submit_button;

    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    private WebElement alertSuccess;

    @FindBy(xpath="//input[@id='radio-button-2']")
            private WebElement radio_button;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.first_name.sendKeys(FirstName);
    }

    public  void enterLastName(){
        this.last_name.sendKeys(LastName);
    }
    public void enterJobTitle(){ this.job_title.sendKeys(JobTitle); }
    public void pressRadio(){ this.radio_button.click();}
    public void pressSubmit(){
        this.submit_button.click();
    }

    public void verifySuccess(){
        this.alertSuccess.isDisplayed();
    }
}
