package com.abdulhakimkaya;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import java.util.TimeZone;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class,
		//org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
		//org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
})
//@SpringBootApplication
public class JavaTutorialsCommonDataApplication {
	@PostConstruct
	public void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
	}

	public static void main(String[] args) {
		// devtools active isActive
		// System.setProperty("spring.devtools.restart.enabled","true");

		//Disables headless JOptionPane
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(JavaTutorialsCommonDataApplication.class, args);
	}  // end PSVM
}  // end class
