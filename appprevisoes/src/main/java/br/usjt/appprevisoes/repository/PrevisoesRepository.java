package br.usjt.appprevisoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.appprevisoes.model.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao, Long> {

}
