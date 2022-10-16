package br.com.walterpaulo.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.walterpaulo.api.dto.Home;
import br.com.walterpaulo.api.models.profissional;
import br.com.walterpaulo.api.services.ProfissionalSevice;

@RestController
public class profissionalController {
  
  @GetMapping("/")
  public Home index(){
    return new Home();
  }

  @GetMapping("/profissionais")
  public List<profissional> listaProfissionla(){
    return ProfissionalSevice.listaProfissional();
  }
}
