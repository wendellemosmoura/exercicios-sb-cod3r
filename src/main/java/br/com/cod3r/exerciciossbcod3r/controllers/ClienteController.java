package br.com.cod3r.exerciciossbcod3r.controllers;

import br.com.cod3r.exerciciossbcod3r.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterClietne() {
        return new Cliente(35, "Wendel", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Melina", "123.456.789-00");
    }

    @GetMapping
    public Cliente obterclientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "Heitor", "987.654.321-00");
    }
}
