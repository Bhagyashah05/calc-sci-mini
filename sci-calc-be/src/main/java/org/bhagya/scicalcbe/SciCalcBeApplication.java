package org.bhagya.scicalcbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@CrossOrigin(origins = "http://localhost:3000")

public class SciCalcBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SciCalcBeApplication.class, args);
    }

}
