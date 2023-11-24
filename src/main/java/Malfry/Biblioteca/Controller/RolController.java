package Malfry.Biblioteca.Controller;

import Malfry.Biblioteca.Model.Rol;
import Malfry.Biblioteca.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    public ResponseEntity<List<Rol>> getAllRoles() {
        List<Rol> roles = rolService.getAllRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rol> getRolById(@PathVariable Long id) {
        Optional<Rol> rol = rolService.getRolById(id);
        return rol.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Rol> createRol(@RequestBody Rol rol) {
        Rol createdRol = rolService.createRol(rol);
        return new ResponseEntity<>(createdRol, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rol> updateRol(@PathVariable Long id, @RequestBody Rol rol) {
        Rol updatedRol = rolService.updateRol(id, rol);
        return Optional.ofNullable(updatedRol)
                .map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRol(@PathVariable Long id) {
        rolService.deleteRol(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

