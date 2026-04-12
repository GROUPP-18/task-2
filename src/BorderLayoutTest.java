import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {

    @Test
    void testObjectCreation() {
        BorderLayoutDemo demo = new BorderLayoutDemo();
        assertNotNull(demo, "The object should be created successfully");
    }


    @Test
    void testMethodExecution() {
        BorderLayoutDemo demo = new BorderLayoutDemo();
        assertDoesNotThrow(() -> demo.method(), "The program should open without errors");
    }


    @Test
    void testUIIntegration() {
        BorderLayoutDemo demo = new BorderLayoutDemo();
        demo.method();

        JFrame foundFrame = null;
        Window[] windows = Window.getWindows();
        for (Window w : windows) {
            if (w instanceof JFrame && ((JFrame) w).getTitle().equals("BorderLayout Demo")) {
                foundFrame = (JFrame) w;
            }
        }

        assertNotNull(foundFrame, "The target JFrame should be found");
        assertTrue(foundFrame.isVisible(), "The JFrame should be visible");
    }
}