package Malfry.Biblioteca.Service.IMPL;

import Malfry.Biblioteca.Model.Prestamo;
import Malfry.Biblioteca.Model.Repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Malfry.Biblioteca.Service.*;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoServiceImpl implements PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @Override
    public List<Prestamo> getAllPrestamos() {
        return prestamoRepository.findAll();
    }

    @Override
    public Optional<Prestamo> getPrestamoById(Long id) {
        return prestamoRepository.findById(id);
    }

    @Override
    public Prestamo createPrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo updatePrestamo(Long id, Prestamo prestamo) {
        if (prestamoRepository.existsById(id)) {
            prestamo.setId(id);
            return prestamoRepository.save(prestamo);
        }
        return null; // Puedes manejar esto de acuerdo a tus necesidades
    }

    @Override
    public void deletePrestamo(Long id) {
        prestamoRepository.deleteById(id);
    }
}

