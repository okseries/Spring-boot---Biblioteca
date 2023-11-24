package Malfry.Biblioteca.Model.Repository;

import Malfry.Biblioteca.Model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}

