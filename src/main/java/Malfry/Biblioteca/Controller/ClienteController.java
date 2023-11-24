package Malfry.Biblioteca.Controller;

import Malfry.Biblioteca.Model.Cliente;
import Malfry.Biblioteca.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;



    @GetMapping
    public ResponseEntity<List<Cliente>> getAllClientes() {
        List<Cliente> clientes = clienteService.getAllClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        Optional<Cliente> cliente = clienteService.getClienteById(id);
        return cliente.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente createdCliente = clienteService.createCliente(cliente);
        return new ResponseEntity<>(createdCliente, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente updatedCliente = clienteService.updateCliente(id, cliente);
        return Optional.ofNullable(updatedCliente)
                .map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

