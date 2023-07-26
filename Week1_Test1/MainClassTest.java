import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int result = MainClass.getLocalNumber();
            Assert.assertEquals(14, result);

    }
}
