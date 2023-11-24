package Malfry.Biblioteca.Service;

import Malfry.Biblioteca.Model.Prestamo;

import java.util.List;
import java.util.Optional;

public interface PrestamoService {

    List<Prestamo> getAllPrestamos();

    Optional<Prestamo> getPrestamoById(Long id);

    Prestamo createPrestamo(Prestamo prestamo);

    Prestamo updatePrestamo(Long id, Prestamo prestamo);

    void deletePrestamo(Long id);
}

