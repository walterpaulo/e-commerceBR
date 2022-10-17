package br.com.walterpaulo.api.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.walterpaulo.api.models.Profissional;
import br.com.walterpaulo.api.modelview.ErroModelView;
import br.com.walterpaulo.api.services.ProfissionalSevice;

@RestController
@RequestMapping("profissionais")
public class ProfissionalController {

  @GetMapping
  public ResponseEntity<List<Profissional>> listaProfissionla(){
    var profissionais = ProfissionalSevice.getInstancia().getProfissionais();
    return ResponseEntity.status(200).body(profissionais);
  }

  @PostMapping
  public ResponseEntity<Profissional> criar(@RequestBody Profissional profissional){
    ProfissionalSevice.getInstancia().adicionar(profissional);
    return ResponseEntity.status(201).body(profissional);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Object> alterar(@PathVariable int id, @RequestBody Profissional profissional){
    var profissionais = ProfissionalSevice.getInstancia().getProfissionais();
    Profissional prof = null;
    for(Profissional profFor : profissionais){
      if(profFor.getId() == id){
        prof = profFor;
        break;
      }
    }
    if(prof == null){
      return ResponseEntity.status(404).body(new ErroModelView("Profissional não encontrado"));
    }

    profissionais.remove(prof);
    
    ProfissionalSevice.getInstancia().adicionar(profissional);
    return ResponseEntity.status(200).body(profissional);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Object> mostrar(@PathVariable int id){
    var profissionais = ProfissionalSevice.getInstancia().getProfissionais();
    Profissional profissional = null;
    for(Profissional profFor : profissionais){
      if(profFor.getId() == id){
        profissional = profFor;
        break;
      }
    }
    if(profissional == null){
      return ResponseEntity.status(404).body(new ErroModelView("Profissional não encontrado"));
    }

    
    ProfissionalSevice.getInstancia().adicionar(profissional);
    return ResponseEntity.status(200).body(profissional);
  }


}
