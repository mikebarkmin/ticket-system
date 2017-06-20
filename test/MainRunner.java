import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import de.ddi.ticketsystem.logic.LogicTestSuite;

public class MainRunner {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(LogicTestSuite.class);
        for (Failure fail : result.getFailures()) {
            System.out.println(fail.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests finished successfully...");
        }
    }
}