package com.raminus.springlog4j2.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raminus.springlog4j2.model.LogData;

@RestController
@RequestMapping("/private/1001")
public class Log4jController {

  private static Logger logger = LogManager.getLogger(Log4jController.class);

  @GetMapping("/logs")
  public ResponseEntity<LogData> getLogData() {
    LogData body = new LogData("info level", "this is log data description");
    body.loggSomething();
    logger.debug("Log4j2 message: {}", () -> body);
    return ResponseEntity.ok(body);
  }
}
