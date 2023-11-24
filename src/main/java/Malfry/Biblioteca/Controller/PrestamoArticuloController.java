/*package Malfry.Biblioteca.Controller;

import Malfry.Biblioteca.Model.PrestamoArticulo;
import Malfry.Biblioteca.Service.PrestamoArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/prestamo-articulos")
public class PrestamoArticuloController {

    @Autowired
    private PrestamoArticuloService prestamoArticuloService;

    @GetMapping
    public ResponseEntity<List<PrestamoArticulo>> getAllPrestamoArticulos() {
        List<PrestamoArticulo> prestamoArticulos = prestamoArticuloService.getAllPrestamoArticulos();
        return new ResponseEntity<>(prestamoArticulos, HttpStatus.OK);
    }

    @GetMapping("/{idPrestamo}")
    public ResponseEntity<PrestamoArticulo> getPrestamoArticuloById(@PathVariable Long idPrestamo){
        Optional<PrestamoArticulo> prestamoArticulo =
                prestamoArticuloService.getPrestamoArticuloById(idPrestamo);
        return prestamoArticulo.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<PrestamoArticulo> createPrestamoArticulo(
            @RequestBody PrestamoArticulo prestamoArticulo) {
        PrestamoArticulo createdPrestamoArticulo =
                prestamoArticuloService.createPrestamoArticulo(prestamoArticulo);
        return new ResponseEntity<>(createdPrestamoArticulo, HttpStatus.CREATED);
    }

    @DeleteMapping("/{idPrestamo}/{idArticulo}")
    public ResponseEntity<Void> deletePrestamoArticulo(
            @PathVariable Long idPrestamo,
            @PathVariable Long idArticulo) {
        prestamoArticuloService.deletePrestamoArticulo(idPrestamo, idArticulo);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}*/
