package com.insilicosoft.portal.svc.welcome;

import com.insilicosoft.portal.svc.welcome.config.PortalProperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class HomeController {

  private final PortalProperties portalProperties;

  public HomeController(PortalProperties portalProperties) {
    this.portalProperties = portalProperties;
  }

  @GetMapping("/")
  public String getGreeting() {
    return "Welcome " + portalProperties.getGreeting() + " !!";
  }

}