package com.leolm.spring_react.basic_project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leolm.spring_react.basic_project.models.ProdutoModel;
import com.leolm.spring_react.basic_project.services.ProdutoService;

@RestController
public class ProdutoController {
    
    @Autowired
    private ProdutoService produtoService;
    
    @GetMapping("/listarTodos")
    public Iterable<ProdutoModel> listarTodos(){
        return produtoService.listarTodos();
    }
    
    @GetMapping("/")
    public String rota(){
        return "Api de produtos funcionado";
    }




}
