package spotifySteps;

import io.cucumber.java.*;
import BaseTest.BaseTest;

import static BaseTest.BaseTest.driver;

public class ServiceHooks {
    BaseTest baseTest;
   
    @Before
    public void initializeBrowser() {
        baseTest = new BaseTest();
        baseTest.openBrowser("chrome");
    }

//    @After
//    public void tearDown() {
//        driver.quit();
//    }
}
