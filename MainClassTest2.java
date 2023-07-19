import org.junit.Assert;
import org.junit.Test;

public class MainClassTest2 extends MainClass2 {

    @Test
    public void testGetClassNumber() {
        int a = 20;
        int b = 45;

        if (a > 45) {
        System.out.println("This will never happen");
    }   else {
            System.out.println("This is what will happen");
        }
        Assert.fail("This message is displayed");

    }
}
