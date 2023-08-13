import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main2 {



    @Test

    public  void testElementHasText(){
        waitForAssertElementHasText(
                By.id("org.wikipedia:id/search_container"),
                "Cannot find 'Search Wikipedia' field",
                15
        );

    }

    private WebElement waitForAssertElementHasText(By by, String error_message, long timeoutInSeconds) {
        WebElement element = waitForAssertElementHasText(by, error_message, timeoutInSeconds);
        element.click();
        return element;
    }




}
