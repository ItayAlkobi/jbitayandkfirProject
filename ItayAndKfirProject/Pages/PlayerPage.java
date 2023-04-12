package selenium.ItayAndKfirProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

import static java.lang.Thread.sleep;

public class PlayerPage {
    @FindBy(css = "button.ytp-button.ytp-settings-button[title='הגדרות']")
    WebElement settingBtn;
    @FindBy(id = "logo-icon")
    WebElement homeBtn;
    @FindBy(css = "div.yt-spec-touch-feedback-shape__fill")
    WebElement shareBtn;
    @FindBy(css = "div.yt-spec-touch-feedback-shape__stroke")
    WebElement copyBtn;
    @FindBy(id = "expand")
    WebElement expendBtn;
    @FindBy(css = "#button-shape > button > yt-touch-feedback-shape > div > div.yt-spec-touch-feedback-shape__fill")
    WebElement menuBtn;
    @FindBy(css = "#items > ytd-menu-service-item-renderer:nth-child(2) > tp-yt-paper-item")
    WebElement watchlistBtn;

    public WebDriver driver;
    public PlayerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    //add videos to watch list
    public void addToWatchList() throws InterruptedException {
        sleep(2000);
    menuBtn.click();
    watchlistBtn.click();
    List<WebElement> playlists = driver.findElements(By.id("checkboxContainer"));
    playlists.get(1).click();
    sleep(2000);
    WebElement exitButton = driver.findElement(By.cssSelector("yt-icon[icon='close']"));
    exitButton.click();
    }
    //Return to home page
    public void returnHomePage() {
        homeBtn.click();
    }
}
