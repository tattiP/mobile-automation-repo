import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber(){
        if (getClassNumber() > 45) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        Assert.fail("Should be more than 45");

    }
}
