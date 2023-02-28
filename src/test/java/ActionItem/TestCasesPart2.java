package ActionItem;

import Reusable_Library.ReusableActions;
import Reusable_Library.TestBase;
import org.testng.annotations.Test;

import static Reusable_Library.TestBase.driver;

public class TestCasesPart2 extends TestBase {
    @Test
    public void tc010_verifyInfoOnRentersPage() {

    }

    @Test
    public void tc011_verifyInfoOnCondoPage() {
        driver.navigate().to("https://www.nationwide.com/personal/insurance/condo/");
        ReusableActions.scrollByPixels(driver, "scroll(0,800)");
        ReusableActions.clickMethod(driver, "//*[text()= 'Standard & optional coverages']", "Standard & optional coverages button");

    }
}//end of class
