package Malfry.Biblioteca.Service;

import Malfry.Biblioteca.Model.Articulo;

import java.util.List;
import java.util.Optional;

public interface ArticuloService {

    List<Articulo> getAllArticulos();

    Optional<Articulo> getArticuloById(Long id);

    Articulo createArticulo(Articulo articulo);

    Articulo updateArticulo(Long id, Articulo articulo);

    void deleteArticulo(Long id);
}

