package Day9_013123;

public class practice {}
  /*
    public static void main(String[] args) {

 //start of clicking on pay at property
            try {
                if (i == 0) {
                    driver.findElements(By.xpath("//*[@class= 'uitk-button uitk-button-medium uitk-button-primary']")).get(20).click();
                    System.out.println("Mini window for pay deposit popped up");
                } else if (i == 1) {
                    System.out.println("No mini window popped up");
                } else if (i == 2) {
                    System.out.println("No mini window popped up");
                }
                Thread.sleep(5000);
            } catch (Exception err) {
                System.out.println("Unable to click on pay at property button for reason: " + err);
            }//end of clicking on pay at property button

        //start of home value try-catch block
        try {
            //store homevalue in a webElement
            WebElement homeValue = driver.findElement(By.xpath("//*[@id = 'homeval']"));
            //clear the default homevalue
            homeValue.clear();
            //enter a new home value
            homeValue.sendKeys("799000");
        } catch (Exception err) {
            System.out.println("Unable to enter home value for reason: " + err);
        }//end of home value try-catch block

        //start of downpayment try-catch block
        try {
            //store downpayment in a webElement
            WebElement downPayment = driver.findElement(By.xpath("//*[@id = 'downpayment']"));
            //clear the default downpayment
            downPayment.clear();
            //enter a new home value
            downPayment.sendKeys("80000");
        } catch (Exception err) {
            System.out.println("Unable to enter down payment for reason: " + err);
        }//end of downpayment try-catch block
        //start of startMonth try-catch block
        try {
            //store startmonth in a webElement
            WebElement startMonth = driver.findElement(By.xpath("//*[@name = 'param[start_month]']"));
            Select startMonthDropDown = new Select(startMonth);
            startMonthDropDown.selectByVisibleText("Jun");
        } catch (Exception err) {
            System.out.println("Unable to select start month dropdown for reason: " + err);
        }//end of startmonth try-catch block

        //start of click on calculate button try-catch block
        try {
            //click on the calculate button
            driver.findElement(By.xpath("//*[@value = 'Calculate']")).click();
        } catch (Exception err) {
            System.out.println("Unable to click on calculate button for reason: " + err);
        }//end of click on calculate button try-catch block

        //start of capture monthly payment try-catch block
        try {
            //capture the monthly payment
            String monthlyPayment = driver.findElements(By.xpath("//*[@class= 'left-cell']/h3")).get(0).getText();
            System.out.println("The monthly payment is: " + monthlyPayment);
        } catch (Exception err) {
            System.out.println("Unable to capture monthly payment for reason: " + err);
        }//end of click on calculate button try-catch block

        //quit the driver
        driver.quit();
    }//end of main


}

 */

