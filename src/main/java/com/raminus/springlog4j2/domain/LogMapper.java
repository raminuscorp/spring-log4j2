package com.raminus.springlog4j2.domain;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class LogMapper {

  private static Logger logger = LogManager.getLogger(LogMapper.class);

  public LogMapper() {

    logger.info("This is message from LogMapper constructor");
  }
}
