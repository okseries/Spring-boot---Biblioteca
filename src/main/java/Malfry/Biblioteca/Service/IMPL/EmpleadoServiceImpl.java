package Malfry.Biblioteca.Service.IMPL;

import Malfry.Biblioteca.Model.Empleado;
import Malfry.Biblioteca.Model.Repository.EmpleadoRepository;
import Malfry.Biblioteca.Service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> getAllEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public Optional<Empleado> getEmpleadoById(Long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado updateEmpleado(Long id, Empleado empleado) {
        if (empleadoRepository.existsById(id)) {
            empleado.setIdEmpleado(id);
            return empleadoRepository.save(empleado);
        }
        return null; // Puedes manejar esto de acuerdo a tus necesidades
    }

    @Override
    public void deleteEmpleado(Long id) {
        empleadoRepository.deleteById(id);
    }
}

