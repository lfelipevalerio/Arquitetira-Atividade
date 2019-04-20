package br.usjt.previsoesV2.repositpry;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsoesV2.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
}