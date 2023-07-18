import org.junit.Assert;
import org.junit.Test;

public class MainClassTest2 extends MainClass2 {

    @Test
    public void testGetClassNumber() {
        int a = 20;

        if (a < 45) {
        System.out.println("True");
    }   else {
            System.out.println("False");
        }
        Assert.fail("This message is displayed");

    }
}
