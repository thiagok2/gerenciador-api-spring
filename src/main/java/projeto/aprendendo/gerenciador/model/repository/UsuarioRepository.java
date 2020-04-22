package projeto.aprendendo.gerenciador.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.aprendendo.gerenciador.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByEmail(String email);
	
	Optional<Usuario> findByEmailAndSenha(String email, String senha);
	
	Optional<Usuario> findByNome(String email);
	
	boolean existsByEmail(String email);

}
