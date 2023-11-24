package Malfry.Biblioteca.Controller;

import Malfry.Biblioteca.Model.Articulo;
import Malfry.Biblioteca.Service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/articulos")
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    @GetMapping
    public ResponseEntity<List<Articulo>> getAllArticulos() {
        List<Articulo> articulos = articuloService.getAllArticulos();
        return new ResponseEntity<>(articulos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Articulo> getArticuloById(@PathVariable Long id) {
        Optional<Articulo> articulo = articuloService.getArticuloById(id);
        return articulo.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Articulo> createArticulo(@RequestBody Articulo articulo) {
        Articulo createdArticulo = articuloService.createArticulo(articulo);
        return new ResponseEntity<>(createdArticulo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Articulo> updateArticulo(@PathVariable Long id, @RequestBody Articulo articulo) {
        Articulo updatedArticulo = articuloService.updateArticulo(id, articulo);
        return Optional.ofNullable(updatedArticulo)
                .map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArticulo(@PathVariable Long id) {
        articuloService.deleteArticulo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

