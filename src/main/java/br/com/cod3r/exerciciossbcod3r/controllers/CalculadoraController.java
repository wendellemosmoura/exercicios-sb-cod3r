package br.com.cod3r.exerciciossbcod3r.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
    // /calculdora/somar/10/20
    @GetMapping("/somar/{a}/{b}")
    public Integer somar(@PathVariable int a, @PathVariable int b) {
        return a + b;
    }

    // /calculdora/subtrair?a=100&b=39
    @GetMapping("/subtrair")
    public Integer subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) {
        return a - b;
    }
}
