package br.usjt_ccp3anmca_rest_json.repository;

import org.springframework.data.jpa.repository.*;

import br.usjt_ccp3anmca_rest_json.model.beans.Livro;

public interface LivroRepository extends JpaRepository <Livro, Long>{

}
