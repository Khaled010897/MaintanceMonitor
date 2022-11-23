package at.fhtw.MaintenanceMonitor.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MSGControllerTest {

    @Test
    @DisplayName("Check motd")
    void Testmotd(){
        assertEquals("Default Message", MSGController.motd);
    }

    @Test
    @DisplayName("Check if message can be set.")
    void Testsetmsg(){
        assertEquals("Test Message", MSGController.setmsg("Test Message"));
    }

    @Test
    @DisplayName("Check if message can be deleted.")
    void Testdelmsg(){
        assertEquals("Default Message", MSGController.delmsg());
    }

}