package murilo.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import murilo.crud.infra.entidades.Usuario;
import murilo.crud.infra.repositorios.RepositorioUsuario;

@Service
public class ServiceUsuario {
    @Autowired
    RepositorioUsuario repositorioUsuario;


public void salvarUsuario(Usuario usuario){
    repositorioUsuario.saveAndFlush(usuario);
    }

    public Usuario buscarUsuario(String email ){
        repositorioUsuario.findyByEmail(email).orElseThrow(
            () -> 
        )
    }
}
