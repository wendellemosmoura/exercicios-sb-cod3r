package br.com.cod3r.exerciciossbcod3r.controllers;

import br.com.cod3r.exerciciossbcod3r.model.entities.Produto;
import br.com.cod3r.exerciciossbcod3r.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(@RequestParam String nome, @RequestParam double preco, @RequestParam double desconto) {
        Produto produto = new Produto(nome, preco, desconto);
        produtoRepository.save(produto);
        return produto;
    }
}