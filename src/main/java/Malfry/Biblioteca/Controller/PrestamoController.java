package Malfry.Biblioteca.Controller;

import Malfry.Biblioteca.Model.Prestamo;
import Malfry.Biblioteca.Service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @GetMapping
    public ResponseEntity<List<Prestamo>> getAllPrestamos() {
        List<Prestamo> prestamos = prestamoService.getAllPrestamos();
        return new ResponseEntity<>(prestamos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> getPrestamoById(@PathVariable Long id) {
        Optional<Prestamo> prestamo = prestamoService.getPrestamoById(id);
        return prestamo.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Prestamo> createPrestamo(@RequestBody Prestamo prestamo) {
        Prestamo createdPrestamo = prestamoService.createPrestamo(prestamo);
        return new ResponseEntity<>(createdPrestamo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prestamo> updatePrestamo(@PathVariable Long id, @RequestBody Prestamo prestamo) {
        Prestamo updatedPrestamo = prestamoService.updatePrestamo(id, prestamo);
        return Optional.ofNullable(updatedPrestamo)
                .map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrestamo(@PathVariable Long id) {
        prestamoService.deletePrestamo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

