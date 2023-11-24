package Malfry.Biblioteca.Model.Repository;

import Malfry.Biblioteca.Model.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}

