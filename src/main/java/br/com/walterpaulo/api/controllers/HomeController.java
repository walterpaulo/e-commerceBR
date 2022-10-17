package br.com.walterpaulo.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.walterpaulo.api.dto.Home;
@RestController
public class HomeController {
  
  @GetMapping("/")
  public Home index(){
    return new Home();
  }

 
}
