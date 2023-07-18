# Mobile-Automation-Repo

public class MainClass {
    public int getLocalNumber()
    {
        return 14;
    }
}

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{

    @Test
    public void testGetLocalNumber() {
        System.out.println(getLocalNumber());
    }
    {
        int expected = 14;
        int actual = 2 * 7;

        Assert.assertTrue("2 * 7 != 14",actual == expected);
        }
    }
