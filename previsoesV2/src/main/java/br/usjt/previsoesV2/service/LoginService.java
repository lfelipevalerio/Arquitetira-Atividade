package br.usjt.previsoesV2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsoesV2.model.Usuario;
import br.usjt.previsoesV2.repositpry.UsuarioRepository;

@Service
public class LoginService {
	@Autowired
	UsuarioRepository usuarioRepo;

	public boolean logar(Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}