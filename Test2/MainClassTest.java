import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassNumber() {

        int a = 20;
        int b = 45;


        if(a > 45) {
            System.out.println("This is what happen");
        }   else {
            System.out.println("This will never happen");
            Assert.assertTrue( "20 < 45",a > b);
        }

    }

    }

