package arrayRotationwithTestcases;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class TestCaseForArrayRotation {
private int[] rotatedArray= {5,6,7,1,2,3,4};
private int[] array={1,2,3,4,5,6,7};
ArrayRotation ar=new ArrayRotation(array,3);

@Test
public void testArrayRotaion() {
	assertArrayEquals(rotatedArray,ar.rotateArray());
}
}
