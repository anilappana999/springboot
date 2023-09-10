package com.log.SpringbootLogger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringbootLoggerApplication {

	  private static final Logger LOGGER = LogManager.getLogger(SpringbootLoggerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootLoggerApplication.class, args);
		
		 LOGGER.info("Info level log message");
	        LOGGER.debug("Debug level log message");
	        LOGGER.error("Error level log message");
	}
	


}
