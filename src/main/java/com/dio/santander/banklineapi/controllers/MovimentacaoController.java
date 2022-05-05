package com.dio.santander.banklineapi.controllers;

import java.util.List;

import com.dio.santander.banklineapi.dto.NovaMovimentacao;
import com.dio.santander.banklineapi.model.Movimentacao;
import com.dio.santander.banklineapi.repositories.MovimentacaoRepository;
import com.dio.santander.banklineapi.services.MovimentacaoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

    @Autowired
    private MovimentacaoService service;

    @Autowired
    private MovimentacaoRepository repository;

    @GetMapping
    public List<Movimentacao> findAll() {
        return this.repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody NovaMovimentacao novaMovimentacao) {
        service.save(novaMovimentacao);
    }
}
