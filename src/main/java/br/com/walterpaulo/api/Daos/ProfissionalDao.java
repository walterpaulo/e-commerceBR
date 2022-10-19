package br.com.walterpaulo.api.Daos;

import br.com.walterpaulo.api.models.Profissional;
import org.springframework.data.repository.CrudRepository;

public interface ProfissionalDao extends CrudRepository<Profissional, Integer>{
}
