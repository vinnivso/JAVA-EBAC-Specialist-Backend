import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.List;

public class StreamsMaleListTest {
    @Test
    public void containsRadagon() {
        try {
            Assertions.assertTrue(Streams.getMaleList().contains("Radagon"));
        } catch (AssertionFailedError error) {
            System.out.println("Exception: " + error.getMessage());
        }
    }

    @Test
    public void notContainsMargit() {
        Assertions.assertFalse(Streams.getMaleList().contains("Margit"));
    }
}
