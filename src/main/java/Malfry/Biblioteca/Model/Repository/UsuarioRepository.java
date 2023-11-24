package Malfry.Biblioteca.Model.Repository;

import Malfry.Biblioteca.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}
