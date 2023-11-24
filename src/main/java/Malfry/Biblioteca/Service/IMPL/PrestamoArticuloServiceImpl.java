/*package Malfry.Biblioteca.Service.IMPL;


import Malfry.Biblioteca.Model.Articulo;
import Malfry.Biblioteca.Model.Prestamo;
import Malfry.Biblioteca.Model.PrestamoArticulo;
import Malfry.Biblioteca.Model.Repository.PrestamoArticuloRepository;
import Malfry.Biblioteca.Service.PrestamoArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoArticuloServiceImpl implements PrestamoArticuloService {


    @Override
    public List<PrestamoArticulo> getAllPrestamoArticulos() {
        return (List<PrestamoArticulo>) prestamoArticuloRepository.findAll();
    }

    @Override
    public Optional<PrestamoArticulo> getPrestamoArticuloById(Prestamo prestamo, Articulo articulo) {
        return prestamoArticuloRepository.findByPrestamoAndArticulo(prestamo, articulo);
    }

    @Override
    public PrestamoArticulo createPrestamoArticulo(PrestamoArticulo prestamoArticulo) {
        return prestamoArticuloRepository.save(prestamoArticulo);
    }

    @Override
    public void deletePrestamoArticulo(Long idPrestamo, Long idArticulo) {
        prestamoArticuloRepository.deletePrestamoArticulo(idPrestamo, idArticulo);
    }
}*/









