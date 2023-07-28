import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber(){
        int number = getClassNumber();

        Assert.assertTrue("Number should be greater than 45",45 < number);

    }
}
