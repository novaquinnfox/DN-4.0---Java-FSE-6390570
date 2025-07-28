package com.cognizant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class springLearnApp {

       private static final Logger LOGGER = LoggerFactory.getLogger(springLearnApp.class);
      public static void main(String[] args) {
        LOGGER.info("Application is starting...");
        SpringApplication.run(springLearnApp.class,args);

   }

}
