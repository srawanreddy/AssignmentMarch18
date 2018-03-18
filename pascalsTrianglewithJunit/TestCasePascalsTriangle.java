package pascalsTrianglewithJunit;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestCasePascalsTriangle {
	PascalsTriangle pt=new PascalsTriangle();
	int res=2;
	@Test
	public void testBinominalCoeff() {
		assertEquals(res,pt.BinominalCoef(2, 1));
	}
}
