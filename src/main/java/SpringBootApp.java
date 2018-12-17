import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.syj.controller")
@SpringBootApplication
public class SpringBootApp {



    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootApp.class, args);
        try {
            System.out.println("begin...............");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("middle...............");
        } finally {
            System.out.println("smart...............");
        }
    }
}
