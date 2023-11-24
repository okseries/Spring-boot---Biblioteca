package Malfry.Biblioteca.Service.IMPL;

import Malfry.Biblioteca.Model.Articulo;
import Malfry.Biblioteca.Model.Repository.ArticuloRepository;
import Malfry.Biblioteca.Service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    private ArticuloRepository articuloRepository;

    @Override
    public List<Articulo> getAllArticulos() {
        return  articuloRepository.findAll();
    }

    @Override
    public Optional<Articulo> getArticuloById(Long id) {
        return articuloRepository.findById(id);
    }

    @Override
    public Articulo createArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    @Override
    public Articulo updateArticulo(Long id, Articulo articulo) {
        if (articuloRepository.existsById(id)) {
            articulo.setIdArticulo(id);
            return articuloRepository.save(articulo);
        }
        return null; // Puedes manejar esto de acuerdo a tus necesidades
    }

    @Override
    public void deleteArticulo(Long id) {
        articuloRepository.deleteById(id);
    }
}
