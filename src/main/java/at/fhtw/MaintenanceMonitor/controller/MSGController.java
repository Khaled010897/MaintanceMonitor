package at.fhtw.MaintenanceMonitor.controller;

import org.springframework.web.bind.annotation.DeleteMapping;

public class MSGController {
    public static String motd = "Default Message";

    /**
     * Rest Methode um die "Message of the day" zu reseten mit einem DELETE request
     * @return
     */
    @DeleteMapping("/monitor")
    public static String delmsg(){
        motd = "Default Message";
        return motd;
    }
}
