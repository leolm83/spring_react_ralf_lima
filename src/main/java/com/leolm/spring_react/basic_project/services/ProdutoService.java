package com.leolm.spring_react.basic_project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leolm.spring_react.basic_project.repositorys.ProdutoRepository;
import com.leolm.spring_react.basic_project.models.ProdutoModel;
import com.leolm.spring_react.basic_project.models.RespostaModel;

@Service
public class ProdutoService {
    
@Autowired
private ProdutoRepository produtoRepository;

@Autowired
private RespostaModel respostaModel;

    public Iterable<ProdutoModel> listarTodos(){
        return produtoRepository.findAll();
    }
}
