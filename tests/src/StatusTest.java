import de.ddi.ticketsystem.Status;

import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class StatusTest {
    int punkte = 0;

    public int getResult() {
        return punkte;
    }

    @Test(name="enumEntries")
    public void enumEntries() {
        Class<Status> c = Status.class;
        if (c.isEnum()) {
            Status[] constants = c.getEnumConstants();
            int count = 0;
            for (Status constant : constants) {
                String name = constant.name();
                switch(name) {
                    case "RECORDED":
                    case "PROCESSED":
                    case "WAITING_FOR_FEEDBACK":
                    case "SOLVED":
                    case "CLOSED":
                        count++;
                        break;
                    default:
                        TracingFramework.printWarning("Status", "Der Status " + name + " wurde nicht spezifiziert.");
                }
            }
            if (count < 5) {
                TracingFramework.printError("Nicht alle Status wurden im inplementiert");
            } else {
                punkte += 10;
            }
        }
    }
}
