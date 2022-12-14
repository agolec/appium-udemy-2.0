import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.appmanagement.AndroidInstallApplicationOptions;
import io.appium.java_client.android.appmanagement.AndroidTerminateApplicationOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AndroidFindElements {
    public static void main(String[] args) throws Exception {

        AppiumDriver driver =  CreateDriverSession.initializeDriver("Android");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        By views = MobileBy.AccessibilityId("Views");
        driver.findElement(views).click();

        ((AndroidDriver) driver).lockDevice();
        System.out.println(((AndroidDriver) driver).isDeviceLocked());
        ((AndroidDriver) driver).unlockDevice();
        //String andAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
         //       + File.separator + "resources" + File.separator + "ApiDemos-debug.apk";
        //driver.installApp(andAppUrl, new AndroidInstallApplicationOptions().withReplaceEnabled());
/*
        Dimension size = driver.manage().window().getSize();
        int startX = size.height / 2;
        int endX = startX;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);
            TouchAction t = new TouchAction(driver);
            t.press(ElementOption.element(driver.findElement(grid)))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
                    .moveTo(ElementOption.element(driver.findElement(animation)))
                    .release()
                    .perform();
*/
    }
}
