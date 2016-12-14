import java.lang.reflect.Field;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;

public class StaticMethods {
    public static Object getValueFromField(Object o, String name) {
        Field field;
        try {
            field = o.getClass().getDeclaredField(name);
            field.setAccessible(true);
            Object value = field.get(o);
            return value;
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            TracingFramework.printError("Das Attribut " + name + " wurde nicht gefunden");
        }
        return null;
    }

    public static void setValueToField(Object o, String name, Object content) {
        Field field;
        try {
            field = o.getClass().getDeclaredField(name);
            field.setAccessible(true);
            field.set(o, content);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
            TracingFramework.printError("Das Attribut " + name + " wurde nicht gefunden");
        }
    }
}
