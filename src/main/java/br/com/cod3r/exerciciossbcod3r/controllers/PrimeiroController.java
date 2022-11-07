package br.com.cod3r.exerciciossbcod3r.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

    @GetMapping(path = {"/ola", "/saudacao"})
    public String ola() {
        return "This could be the day that we push through\n" +
                "<br>It could be the day that all our dreams come true\n" +
                "<br>For me and you";
    }
}
