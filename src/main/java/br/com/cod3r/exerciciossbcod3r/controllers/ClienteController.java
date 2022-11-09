package br.com.cod3r.exerciciossbcod3r.controllers;

import br.com.cod3r.exerciciossbcod3r.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping(path = "/clientes/qualquer")
    public Cliente obterClietne() {
        return new Cliente(35, "Wendel", "123.456.789-00");
    }
}
