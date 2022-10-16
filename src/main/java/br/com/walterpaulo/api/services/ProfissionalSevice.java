package br.com.walterpaulo.api.services;

import java.util.ArrayList;
import java.util.List;

import br.com.walterpaulo.api.models.profissional;

public class ProfissionalSevice {

  public static List<profissional> listaProfissional(){
    List<profissional> lista = new ArrayList<>();
    lista.add(new profissional(1, "Danilo"));
    lista.add(new profissional(2, "Walter"));
    lista.add(new profissional(3, "Melena"));

    return lista;
  }
  
}
