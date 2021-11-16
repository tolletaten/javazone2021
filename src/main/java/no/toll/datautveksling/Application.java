package no.toll.datautveksling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Application {

  private static final Logger logger = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    try {
      SpringApplication.run(Application.class, args);
    } catch (Exception e) {
      logger.error("Applikasjon feilet ved oppstart", e);
      System.exit(-1);
    }
  }
}
