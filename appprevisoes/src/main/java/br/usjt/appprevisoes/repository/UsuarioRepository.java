package br.usjt.appprevisoes.repository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Usuario findOneByLoginAndSenha(String login, String senha);
}