package projeto.aprendendo.gerenciador.service;

import java.util.Optional;

import projeto.aprendendo.gerenciador.model.entity.Usuario;

public interface UsuarioService {
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email);
	
	Optional<Usuario> obterPorId(Long id);

}
