package at.fhtw.MaintenanceMonitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

/**
 * Main Klasse zum Ausführen vom Rest Server.
 */
@SpringBootApplication
public class MaintenanceMonitorApplication {

    public static Boolean isUp = true;
    public static int minute = 60;
    public static int hour = 3600;
    public static int month = 2592000;

    /**
     * int time - beschreibt den Zeitraum in dem es funktionieren soll
     * double SLA - beschreibt den Service Level Agreement wie lange es in einem Zeitraum
     * Diese Methode berechnet sie anhand der SLA und time wie lange die Website in Error Status übergeht
     */
    public static void isUp(int time, double SLA){
        Random r = new Random(420);
        ModelAndView timer = new ModelAndView();
        while(true){
            int rand = r.nextInt(time);
            isUp = true;
            for(int i = 0; i<time; i++) {
                isUp = i<rand || i>rand+(time*(1-SLA));
                if(!isUp){ timer.addObject("timer",time*(1-SLA)); }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

	public static void main(String[] args) {
        SpringApplication.run(MaintenanceMonitorApplication.class, args);
        isUp(minute,0.95);
	}

}
