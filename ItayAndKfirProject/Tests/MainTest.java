package selenium.ItayAndKfirProject.Tests;

import org.openqa.selenium.chrome.ChromeDriver;
import selenium.ItayAndKfirProject.Pages.HomePage;
import selenium.ItayAndKfirProject.Pages.PlayerPage;
import static java.lang.Thread.sleep;

public class MainTest {
    public static void main(String[] args) throws InterruptedException {
        SeleniumBaseItayAndKfir base = new SeleniumBaseItayAndKfir();
        ChromeDriver driver = base.SeleniumInIt("https://www.youtube.com/");
        HomePage homePage = new HomePage(driver);
        PlayerPage playerPage = new PlayerPage(driver);
        homePage.login("itayandkfir@gmail.com", "itay1234");
        homePage.topHits("סילסולים");
        playerPage.addToWatchList();
        homePage.topHits("שקיעות אדומות");
        playerPage.addToWatchList();
        homePage.topHits("מלכת השושנים");
        playerPage.addToWatchList();
        homePage.topHits("סהרה לייב");
        playerPage.addToWatchList();
        playerPage.returnHomePage();
        homePage.playWatchlist();
        sleep(20000);
        base.seleniumClose(driver);
    }
}
