package Malfry.Biblioteca.Service;

import Malfry.Biblioteca.Model.Rol;

import java.util.List;
import java.util.Optional;

public interface RolService {

    List<Rol> getAllRoles();

    Optional<Rol> getRolById(Long id);

    Rol createRol(Rol rol);

    Rol updateRol(Long id, Rol rol);

    void deleteRol(Long id);
}

