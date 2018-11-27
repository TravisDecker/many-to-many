package edu.cnm.deepdive.manytomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableEntityLinks;

@EnableEntityLinks
@SpringBootApplication
public class ManyToManyApplication {

  public static void main(String[] args) {
    SpringApplication.run(ManyToManyApplication.class, args);
  }
}
