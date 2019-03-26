package br.usjt.hellospringboot.repository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
}