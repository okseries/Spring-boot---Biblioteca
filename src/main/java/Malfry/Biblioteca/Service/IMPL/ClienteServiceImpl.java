package Malfry.Biblioteca.Service.IMPL;

import Malfry.Biblioteca.Model.Cliente;
import Malfry.Biblioteca.Model.Repository.ClienteRepository;
import Malfry.Biblioteca.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> getClienteById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente createCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente updateCliente(Long id, Cliente cliente) {
        if (clienteRepository.existsById(id)) {
            cliente.setIdCliente(id);
            return clienteRepository.save(cliente);
        }
        return null; // Puedes manejar esto de acuerdo a tus necesidades
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
