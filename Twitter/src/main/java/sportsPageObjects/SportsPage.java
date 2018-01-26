package sportsPageObjects;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportsPage extends CommonAPI{
    @FindBy(className = "StreamsHero-image")
    public static WebElement heroImage;
    @FindBy(xpath = "//*[@id=\"timeline\"]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div/div/div/div/div/div/div[1]/div/div/div[1]")
    public static WebElement firstSportsVideo;
    @FindBy(xpath = "//a[text()='Premier League']")
    public static WebElement primierLink;
    @FindBy(xpath = "//*[@id=\"timeline\"]/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/div[2]/div[1]/button/div/span[1]")
    public static WebElement replyLink;
    @FindBy(xpath = "//*[@id='signup-dialog-dialog']/button")
    public static WebElement dismiss;

    //T3TWI_SP_TC01 verify First Sports video if it is displayed
    public boolean verifyFirstSportsImage(){
        boolean bl = firstSportsVideo.isDisplayed();
        return bl;
    }
    //T3TWI_SP_TC02 Play first video for few seconds and stop the video
    public void playFirstVideo(){
        driver.switchTo().frame("");
        firstSportsVideo.click();
        implicitWait(driver, 15);
        firstSportsVideo.click();
    }
    //T3TWI_SP_TC03 verify Reply Link
    public void verifyReplylink(){
        replyLink.click();
        implicitWait(driver,5);
        dismiss.click();
    }

}
