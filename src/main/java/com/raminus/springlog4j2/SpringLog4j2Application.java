package com.raminus.springlog4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLog4j2Application implements ApplicationRunner {

  private static final Logger logger = LogManager.getLogger(SpringLog4j2Application.class);

  public static void main(String[] args) {
    SpringApplication.run(SpringLog4j2Application.class, args);
  }

  @Override
  public void run(ApplicationArguments args) {
    logger.debug("Debugging log");
    logger.info("Info log");
    logger.warn("Hey, This is a warning!");
    logger.error("Oops! We have an Error. OK");
    logger.fatal("Fatal error. Please fix me.");
  }
}
