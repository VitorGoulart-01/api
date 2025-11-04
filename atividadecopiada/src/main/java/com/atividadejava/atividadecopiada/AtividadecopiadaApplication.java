package com.atividadejava.atividadecopiada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadecopiadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtividadecopiadaApplication.class, args);

		 System.out.println("\n");
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   API Cliente e Produtos               ║");
        System.out.println("║   Spring Boot iniciado com sucesso!    ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║   Acesse os endpoints:                 ║");
        System.out.println("║   http://localhost:8080/api            ║");
        System.out.println("║   http://localhost:8080/api/cliente    ║");
        System.out.println("║   http://localhost:8080/api/clientes   ║");
        System.out.println("║   http://localhost:8080/api/produto    ║");
        System.out.println("║   http://localhost:8080/api/produtos   ║");
        System.out.println("║   http://localhost:8080/api/dados      ║");
        System.out.println("╚════════════════════════════════════════╝\n");
    }


}


