package selenium.ItayAndKfirProject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static java.lang.Thread.sleep;

public class HomePage {
    @FindBy(name = "identifier")
    WebElement userName;
    @FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button")
    WebElement nextBtn;
    @FindBy(name = "Passwd")
    WebElement pw;
    @FindBy(className = "VfPpkd-muHVFf-bMcfAe")
    WebElement showPw;
    @FindBy (xpath = "//*[@id=\"passwordNext\"]/div/button/span")
    WebElement nextBtn2;
    @FindBy(name = "search_query")
    WebElement searchField;
    @FindBy(id = "search-icon-legacy")
    WebElement searchBtn;
    @FindBy(css = "ytd-video-renderer #thumbnail")
    WebElement firstVideo;
    @FindBy(css = "yt-formatted-string.title.style-scope.ytd-guide-entry-renderer[6]")
    WebElement watchListBtn;
    @FindBy(css = "yt-icon#guide-icon")
    WebElement burgerBtn;
    @FindBy(xpath = "//yt-formatted-string[@class='title style-scope ytd-guide-entry-renderer'][@dir='auto'][text()='Project']")
    WebElement projectWatchListBtn;
    @FindBy (css = "span.style-scope.ytd-thumbnail-overlay-hover-text-renderer")
    WebElement playBtn;

    public WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    // User login flow
    public void login(String userText, String pwText) throws InterruptedException {
        WebElement loginBtn = driver.findElement(By.cssSelector("a[href*='ServiceLogin']"));
        loginBtn.click();
        userName.click();
        userName.clear();
        userName.sendKeys(userText);
        nextBtn.click();
        pw.click();
        pw.clear();
        pw.sendKeys(pwText);
        showPw.click();
        nextBtn2.click();
    }
    //search videos flow
    public void topHits(String searchText) throws InterruptedException {
    searchField.click();
    searchField.clear();
    searchField.sendKeys(searchText);
    searchBtn.click();
    firstVideo.click();
    }
    //play the selected videos
    public void playWatchlist () throws InterruptedException {
        sleep(2000);
        projectWatchListBtn.click();
        playBtn.click();
    }
}