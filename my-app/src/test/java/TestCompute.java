import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

public class TestCompute {
    Compute compute;
    MessageQueue mq;



    @Before
    public void setUp() {
        mq=mock(MessageQueue.class);
        compute=new Compute(mq); 
    }



    //test1 method tests the countNumberOfOccurrences method to return -1 when the MessageQueue is empty. This verifies that -1 is performed by the method if the queue is empty.
    @Test
    public void test1() {
        when(mq.size()).thenReturn(0);

        assertEquals(-1,compute.countNumberOfOccurrences("element"));
    }



    //test2 method tests that the countNumberOfOccurrences method returns 0 if the searched item is not present in the MessageQueue. That is, if the searched item is not in the queue, the method should return 0.
    @Test
    public void test2() {
        when(mq.size()).thenReturn(3);
        when(mq.contains("element")).thenReturn(false);

        assertEquals(0,compute.countNumberOfOccurrences("element"));
    }



    //test3 method tests whether the countNumberOfOccurrences method correctly returns the count of the element sought in the MessageQueue if it exists. This verifies that the searched item must be present in the queue and the method must calculate the number of this item correctly
    @Test
    public void test3() {
        when(mq.size()).thenReturn(3);
        when(mq.contains("element")).thenReturn(true);
        when(mq.getAt(0)).thenReturn("element");
        when(mq.getAt(1)).thenReturn("another");
        when(mq.getAt(2)).thenReturn("element");

        assertEquals(2,compute.countNumberOfOccurrences("element"));
    }
 
}