package at.fhtw.MaintenanceMonitor.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class MSGController {
    public static String motd = "Default Message";

    /**
     * Rest Methode um die "Message of the day" abfragen mit einem POST request
     * @return
     */
    @PutMapping("/monitor")
    public static String setmsg(@RequestBody String msg){
        motd = msg;
        return motd;
    }

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
