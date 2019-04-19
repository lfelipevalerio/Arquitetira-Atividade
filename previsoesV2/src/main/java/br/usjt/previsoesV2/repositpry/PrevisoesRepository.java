package br.usjt.previsoesV2.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.previsoesV2.model.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao, Long>{

}
