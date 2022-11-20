package at.fhtw.MaintenanceMonitor.controller;

import at.fhtw.MaintenanceMonitor.MaintenanceMonitorApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {

    @GetMapping("/green")
    public String green(){
        return "green";
    }

    @GetMapping("/red")
    public String red(){
        return "red";
    }


}
