package com.atividadejava.atividadecopiada.controller;

import com.atividadejava.atividadecopiada.cliente.Cliente;
import com.atividadejava.atividadecopiada.produto.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RquestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/")
public class ApiController {
    @GetMapping
    public Map<String, Object> raiz(){
        Map<String, Object> reposta = new HashMap();
        reposta.put("mensagem", "Bem-vindo à API de Cliente e Produtos!");
        reposta.put("versao", "1.0.0");
        reposta.put("descricao", "API REST com Spring Boot");

        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("Info", "GET /");
        endpoints.put("1 Cliente", "GET / cliente");
        endpoints.put("Varios Clientes", "GET /clientes");
        endpoints.put("Tudo junto", "GET /dados");
        endpoints.put("Clientes por faixa etaria", "GET/ clientes-maiores-30");
        endpoints.put("Produtos baratos", "GET /produtos-baratos");

        resposta.put("endpoints", endpoints);
        reposta.put("status", "ONLINE");

        return resposta;

    }

    @GetMapping("/cliente")
    public Cliente obterCliente(){
        return new Cliente("João Silva", 28, "joao@email.com");

    }

    @GetMapping("/clientes")
    public List<CLiente> obterClientes(){
        
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente)
    }



}
