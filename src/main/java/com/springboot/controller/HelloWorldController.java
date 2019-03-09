package com.springboot.controller;

import com.springboot.constants.RestApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(RestApi.SPRING)
public class HelloWorldController {

  private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

  @GetMapping(RestApi.GET_DATA)
  public String get(){
    LOGGER.info("Inside Controller");
    return "Hello World";
  }
}
