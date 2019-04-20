package br.usjt.previsoesV2.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsoesV2.model.Cidade;

public interface CidadesRepository extends JpaRepository<Cidade, Long>{

	public Cidade findByLatitudeAndLongitude (String latitude, String longitude);
	public Cidade findByNome (String nome);
}
