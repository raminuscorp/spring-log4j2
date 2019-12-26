package com.raminus.springlog4j2.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class LogData {

  private static Logger logger = LogManager.getLogger(LogData.class);
  private String level;
  private String description;

  public void loggSomething() {
    //This will not get printed. because logger name com.raminus.springlog4j2.model is configured log level with info
    logger.debug("This is debug message loggSomething from LogData\n");
  }
}
