package com.github.derickpipoca.produtosapi.controller;

import com.github.derickpipoca.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto Recebido: "+ produto);
        return produto;
    }
}
