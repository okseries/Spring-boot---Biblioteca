package Malfry.Biblioteca.Service.IMPL;

import Malfry.Biblioteca.Model.Repository.RolRepository;
import Malfry.Biblioteca.Model.Rol;
import Malfry.Biblioteca.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> getAllRoles() {
        return rolRepository.findAll();
    }

    @Override
    public Optional<Rol> getRolById(Long id) {
        return rolRepository.findById(id);
    }

    @Override
    public Rol createRol(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public Rol updateRol(Long id, Rol rol) {
        if (rolRepository.existsById(id)) {
            rol.setIdRol(id);
            return rolRepository.save(rol);
        }
        return null; // Puedes manejar esto de acuerdo a tus necesidades
    }

    @Override
    public void deleteRol(Long id) {
        rolRepository.deleteById(id);
    }
}

