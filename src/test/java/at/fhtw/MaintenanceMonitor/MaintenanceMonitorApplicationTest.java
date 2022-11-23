package at.fhtw.MaintenanceMonitor;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorApplicationTest {

    @Test
    @DisplayName("Checks if the website is up.")
    void TestifUp(){
        assertEquals(true, MaintenanceMonitorApplication.isUp);
    }


}