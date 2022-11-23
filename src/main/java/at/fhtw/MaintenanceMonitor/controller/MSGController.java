package at.fhtw.MaintenanceMonitor.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MSGController {

    public static String motd = "Default Message";

    /**
     * Rest Methode um die "Message of the day" abfragen mit einem GET Request
     * @return Message of the day
     */
    @GetMapping("/monitor")
    public String getmsg(){
        return motd;
    }

    /**
     * Rest Methode um die "Message of the day" abfragen mit einem POST request
     * @return Message of the day
     */
    @PutMapping("/monitor")
    public static String setmsg(@RequestBody String msg){
        motd = msg;
        return motd;
    }

    /**
     * Rest Methode um die "Message of the day" zu reseten mit einem DELETE request
     * @return Message of the day
     */
    @DeleteMapping("/monitor")
    public static String delmsg(){
        motd = "Default Message";
        return motd;
    }
}
