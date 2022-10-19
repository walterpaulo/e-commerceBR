package br.com.walterpaulo.api.services;

import java.util.ArrayList;
import java.util.List;

import br.com.walterpaulo.api.models.Profissional;


public class ProfissionalService {

  private ProfissionalService() {

  }

  private List<Profissional> profissionals;
  private static ProfissionalService profissionalService;

  public static ProfissionalService getInstancia() {
    if (profissionalService == null)
      profissionalService = new ProfissionalService();
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
    var profissionais = ProfissionalService.getInstancia().getProfissionais();
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
