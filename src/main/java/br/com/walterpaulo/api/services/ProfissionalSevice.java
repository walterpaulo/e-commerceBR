package br.com.walterpaulo.api.services;

import java.util.ArrayList;
import java.util.List;

import br.com.walterpaulo.api.models.Profissional;


public class ProfissionalSevice {

  private ProfissionalSevice() {

  }

  private List<Profissional> profissionals;
  private static ProfissionalSevice profissionalService;

  public static ProfissionalSevice getInstancia() {
    if (profissionalService == null)
      profissionalService = new ProfissionalSevice();
    return profissionalService;
  }

  public List<Profissional> getProfissionais() {
    if (this.profissionals == null)
      this.profissionals = new ArrayList<>();
    return this.profissionals;
  }

  public void adicionar(Profissional profissional) {
    this.getProfissionais().add(profissional);
  }

  public Profissional buscaPorId(int id){
    var profissionais = ProfissionalSevice.getInstancia().getProfissionais();
    Profissional profissional = null;
    for(Profissional profFor : profissionais){
      if(profFor.getId() == id){
        profissional = profFor;
        return profissional;
      }
    }
    return null;
  }

}
