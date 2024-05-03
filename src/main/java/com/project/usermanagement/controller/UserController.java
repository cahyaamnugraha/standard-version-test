package com.project.usermanagement.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cahyaam
 */
@CrossOrigin
@RestController
@RequestMapping("/home")
public class UserController {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @GetMapping(value = "/all", produces = APPLICATION_JSON_VALUE)
  public ResponseEntity<?> getAll() {

    return ResponseEntity.ok().build();
  }

}
