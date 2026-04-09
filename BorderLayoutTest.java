import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {

    // Unit Test 1
    @Test
    void testObjectCreation() {
        BorderLayoutDemo demo = new BorderLayoutDemo();
        assertNotNull(demo, "Object should be created successfully");
    }

    // Unit Test 2
    @Test
    void testMethodExists() {
        BorderLayoutDemo demo = new BorderLayoutDemo();
        assertDoesNotThrow(() -> demo.method());
    }

    // Integration Test
    @Test
    void testUIIntegration() {
        BorderLayoutDemo demo = new BorderLayoutDemo();
        demo.method();

        JFrame foundFrame = null;
        Window[] windows = Window.getWindows();
        for (Window w : windows) {
            if (w instanceof JFrame) {
                foundFrame = (JFrame) w;
            }
        }

        assertNotNull(foundFrame, "JFrame should exist");
        assertTrue(foundFrame.isVisible(), "JFrame should be visible");
    }
}