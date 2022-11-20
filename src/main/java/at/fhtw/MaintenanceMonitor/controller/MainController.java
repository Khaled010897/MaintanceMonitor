package at.fhtw.MaintenanceMonitor.controller;

import at.fhtw.MaintenanceMonitor.MaintenanceMonitorApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {

    /**
     * Default methode die die Website aufruft und überprüft ob sie "up" oder "down" ist
     * @return
     */
    @GetMapping("/")
    public String periodic(){
        if (!MaintenanceMonitorApplication.isUp)return "rednew";
        return "green";
    }

}
