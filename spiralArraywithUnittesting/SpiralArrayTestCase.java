package spiralArraywithUnittesting;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class SpiralArrayTestCase {
int array[][]= {{1,2,3},{4,5,6},{7,8,9}};
int ExpectedArray[]= {1,2,3,6,9,8,7,4,5};
SpiralPrintArray sp=new SpiralPrintArray();




@Test
public void testSpiralArray() {
	assertArrayEquals(ExpectedArray,sp.printSpiralArray(array));
}
}
