package murilo.crud.infra.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import murilo.crud.infra.entidades.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Integer>{

    Optional<Usuario> findByEmail(String email);
    
}
