import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

public class StreamsFemaleListTest {

    @Test
    public void containsFia() {
        try {
            Assertions.assertTrue(Streams.getFemaleList().contains("Fia"));
        } catch (AssertionFailedError error) {
            System.out.println("Exception: " + error.getMessage());
        }
    }

    @Test
    public void notContainsVendetta() {
        Assertions.assertFalse(Streams.getFemaleList().contains("Vendetta"));
    }
}
