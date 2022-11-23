package at.fhtw.MaintenanceMonitor.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerTest {

    @Test
    @DisplayName("Checks if the green.html is available")
    void TestGreen() {
        File file = new File("src/main/resources/templates/green.html");
        assertEquals(true, file.exists());
    }

    @Test
    @DisplayName("Checks if the red.html is available")
    void TestRed() {
        File file = new File("src/main/resources/templates/red.html");
        assertEquals(true, file.exists());
    }
}