package com.insilicosoft.portal.svc.welcome.controller;

import com.insilicosoft.portal.svc.welcome.config.PortalProperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

  private final PortalProperties portalProperties;

  public TestController(PortalProperties portalProperties) {
    this.portalProperties = portalProperties;
  }

  @GetMapping("/token")
  public String getGreeting() {
    return "Welcome " + portalProperties.getGreeting() + " !!";
  }

}