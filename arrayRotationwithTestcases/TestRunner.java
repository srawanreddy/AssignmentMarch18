package arrayRotationwithTestcases;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class TestRunner {
public static void main(String args[]) {
	Result result=JUnitCore.runClasses(TestCaseForArrayRotation.class);
	for(Failure failures:result.getFailures()) {System.out.println(failures.toString());}
	
	System.out.println(result.wasSuccessful());
	
}
}
