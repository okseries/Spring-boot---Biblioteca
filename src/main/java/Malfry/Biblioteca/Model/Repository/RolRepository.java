package Malfry.Biblioteca.Model.Repository;

import Malfry.Biblioteca.Model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}
