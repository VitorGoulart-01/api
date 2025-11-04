package com.atividadejava.atividadecopiada.controller;

import com.atividadejava.atividadecopiada.cliente.Cliente;
import com.atividadejava.atividadecopiada.produto.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
        Map<String, Object> resposta = new HashMap();
        resposta.put("mensagem", "Bem-vindo à API de Cliente e Produtos!");
        resposta.put("versao", "1.0.0");
        resposta.put("descricao", "API REST com Spring Boot");

        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("Info", "GET /");
        endpoints.put("1 Cliente", "GET / cliente");
        endpoints.put("Varios Clientes", "GET /clientes");
        endpoints.put("Tudo junto", "GET /dados");
        endpoints.put("Clientes por faixa etaria", "GET/ clientes-maiores-30");
        endpoints.put("Produtos baratos", "GET /produtos-baratos");

        resposta.put("endpoints", endpoints);
        resposta.put("status", "ONLINE");

        return resposta;

    }

    @GetMapping("/cliente")
    public Cliente obterCliente(){
        return new Cliente("João Silva", 28, "joao@email.com");

    }

    @GetMapping("/clientes")
    public List<Cliente> obterClientes(){
        
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Joao Silva", 28, "joao@email.com"));
        clientes.add(new Cliente("Maria Santos", 35, "maria@email.com"));
        clientes.add(new Cliente("Pedro Oliveira", 42, "pedro@email.com"));
        clientes.add(new Cliente("Ana Costa", 31, "ana@email.com"));
        clientes.add(new Cliente("Carlos Mendes", 25, "carlos@email.com"));
        clientes.add(new Cliente("Juliana Pereira", 38, "juliana@email.com"));
        clientes.add(new Cliente("Roberto Ferreira", 55, "roberto@email.com"));
        clientes.add(new Cliente("Fernanda Lima", 29, "fernanda@email.com"));
        clientes.add(new Cliente("Lucas Rocha", 23, "lucas@email.com"));
        clientes.add(new Cliente("Patricia Gomes", 44, "patricia@email.com"));
        return clientes;

    }

    @GetMapping("/produto")
    public Produto obterProduto(){
        return new Produto("notebook DEll", 3500.00);

    }

    @GetMapping("/produtos")
    public List<Produto> obterProdutos(){
        List<Produto> produtos = new ArrayList<>();

         produtos.add(new Produto("Notebook Dell Inspiron 15", 3500.00));
        produtos.add(new Produto("Notebook Lenovo IdeaPad", 2800.00));
        produtos.add(new Produto("Notebook HP Pavilion", 3200.00));
        produtos.add(new Produto("Notebook ASUS VivoBook", 2600.00));

        produtos.add(new Produto("Mouse Logitech MX Master", 350.00));
        produtos.add(new Produto("Mouse Razer DeathAdder", 280.00));
        produtos.add(new Produto("Teclado Mecânico RGB", 450.00));
        produtos.add(new Produto("Teclado Bluetooth Wireless", 180.00));

        produtos.add(new Produto("Monitor LG 24 polegadas", 900.00));
        produtos.add(new Produto("Monitor Dell 27 polegadas 144Hz", 1400.00));
        produtos.add(new Produto("Monitor Samsung 32 polegadas 4K", 2200.00));
        produtos.add(new Produto("Monitor ASUS Curvo 34\"", 2800.00));

        produtos.add(new Produto("Webcam Logitech C920", 380.00));
        produtos.add(new Produto("Headset HyperX Cloud Flight", 650.00));
        produtos.add(new Produto("Microfone Blue Yeti", 520.00));
        produtos.add(new Produto("Alto-falante JBL Bluetooth", 250.00));

        produtos.add(new Produto("Mousepad XL Gamer", 120.00));
        produtos.add(new Produto("Hub USB-C 7 em 1", 280.00));
        produtos.add(new Produto("Webcam anel de luz LED", 180.00));
        produtos.add(new Produto("Suporte para notebook", 90.00));

                return produtos;

        


    }

    @GetMapping("dados")
    public Map<String, Object> obterTodosDados(){
        Map<String, Object> dados = new HashMap<>();

        List<Cliente> clientes = obterClientes();
        List<Produto> produtos = obterProdutos();

        dados.put("clientes", clientes);
        dados.put("produtos", produtos);
        dados.put("totalClientes", clientes.size());
        dados.put("totalProdutos", produtos.size());
        dados.put("status", "Dados carregados com sucesso");

        return dados;

       



    }
     @GetMapping("/cliente-maores-30")
         public Map<String, Object> obterClientesMaiores30() {
            
            List<Cliente> todos = obterClientes();
            List<Cliente> maiores30 = new ArrayList<>();

            for(Cliente cliente : todos){
                if(cliente.getIdade() > 30){
                    maiores30.add(cliente);
                }
            }
             Map<String, Object> resultado = new HashMap<>();
        resultado.put("totalEncontrados", maiores30.size());
        resultado.put("clientes", maiores30);

        return resultado;


        }


        @GetMapping("/estatisticas")
        public Map<String, Object> obterEstatisticas(){
            List<Cliente> clientes = obterClientes();
            List<Produto> produtos = obterProdutos();

            double precoMedio = 0;
            double precoMaximo = 0;
            double precoMinimo = Double.MAX_VALUE;

            for(Produto p : produtos) {
                precoMedio += p.getPreco();
                if(p.getPreco() > precoMaximo) precoMaximo = p.getPreco();
                if(p.getPreco() < precoMinimo) precoMinimo = p.getPreco();
            }

            precoMedio = precoMedio / produtos.size();

            int idadeMedia = 0;
            for(Cliente c : clientes){
                idadeMedia += c.getIdade();

            }
            idadeMedia = idadeMedia / clientes.size();

            Map<String, Object> stats = new HashMap<>();
            stats.put("totalClientes", clientes.size());
         stats.put("idadeMedia", idadeMedia);
         stats.put("totalProdutos", produtos.size());
         stats.put("precoMedio", String.format("R$ %.2f", precoMedio));
         stats.put("precoMaximo", String.format("R$ %.2f", precoMaximo));
         stats.put("precoMinimo", String.format("R$ %.2f", precoMinimo));

         return stats;

        }

       





}
