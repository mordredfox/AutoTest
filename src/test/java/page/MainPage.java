package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class MainPage extends BasePage {

    String SITE_URL = "https://redactor-razmetki.netlify.app/";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(SITE_URL);
    }

    @FindBy (xpath = "(//div[@class='MuiListItemText-root css-pxu0b3'])[1]")
    public static WebElement dropdownElements;
    @FindBy (xpath = "(//div[@class='MuiListItemText-root css-pxu0b3'])[2]")
    public static WebElement dropdownText;
    @FindBy (xpath = "(//div[@class='MuiListItemText-root css-pxu0b3'])[3]")
    public static WebElement dropdownMedia;
    @FindBy (xpath = "(//div[@class='MuiListItemText-root css-pxu0b3'])[4]")
    public static WebElement dropdownContainers;
    @FindBy (xpath = "(//div[@class='MuiListItemText-root css-pxu0b3'])[5]")
    public static WebElement dropdownOther;
    @FindBy (xpath = "//div[@class='MuiBox-root css-13l6if0']")
    public static WebElement dropdownParameters;
    @FindBy (xpath = "(//button[@type='button'])[1]")
    public static WebElement buttonCanvas;
    @FindBy (xpath = "(//button[@type='button'])[2]")
    public static WebElement buttonHtml;
    @FindBy (xpath = "(//button[@type='button'])[3]")
    public static WebElement buttonCss;
    @FindBy (xpath = "//button[@aria-label='clear canvas']")
    public static WebElement buttonClean;
    @FindBy (xpath = "//button[@aria-label='download canvas']")
    public static WebElement buttonDownload;
    @FindBy (xpath = "//div[@class='MuiBox-root css-1um0vq4']")
    public static WebElement areaCanvas;
    @FindBy (xpath = "//p[contains(text(),'HTML')]")
    public static WebElement areaHtml;
}
