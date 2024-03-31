import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
    Util c;



    @Before
    public void setUp() {
        c=new Util();
    }


    //test1 method tests whether the compute method returns false when called with a single argument. This is done because the method definition states that it should return false when the number of arguments is odd.
    @Test
    public void test1() {
        assertFalse(c.compute(1));
    }



    //test2 method tests whether the compute method returns false when called with an even number arguments. The method should return false when the number of arguments is even.
    @Test
    public void test2() {
        assertFalse(c.compute(1,2));
    }



    //test3 method tests the compute method returns true if the sum of the arguments is divisible by any of these arguments.
    @Test
    public void test3() {
        assertTrue(c.compute(1,2,3));
    }



    //test4 method tests that the compute method returns false if the sum of the arguments is not divisible by any of these arguments.
    @Test
    public void test4() {
        assertFalse(c.compute(2,4,7));
    }



    //test5 method tests whether the compute method throws a RuntimeException when one of the arguments are 0. According to method definition, it should throw an error if one of the arguments is 0.
    @Test(expected = RuntimeException.class)
    public void test5() {
        c.compute(1,2,0);
    }
}