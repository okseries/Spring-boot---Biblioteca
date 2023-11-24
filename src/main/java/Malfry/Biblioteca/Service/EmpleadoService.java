package Malfry.Biblioteca.Service;

import Malfry.Biblioteca.Model.Empleado;

import java.util.List;
import java.util.Optional;

public interface EmpleadoService {

    List<Empleado> getAllEmpleados();

    Optional<Empleado> getEmpleadoById(Long id);

    Empleado createEmpleado(Empleado empleado);

    Empleado updateEmpleado(Long id, Empleado empleado);

    void deleteEmpleado(Long id);
}

