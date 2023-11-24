package Malfry.Biblioteca.Service;

import Malfry.Biblioteca.Model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<Usuario> getAllUsuarios();

    Optional<Usuario> getUsuarioById(Long id);

    Usuario createUsuario(Usuario usuario);

    Usuario updateUsuario(Long id, Usuario usuario);

    void deleteUsuario(Long id);
}

