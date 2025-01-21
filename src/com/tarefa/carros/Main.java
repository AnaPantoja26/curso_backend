package com.tarefa.carros;

import com.tarefa.carros.dao.CarroDAO;
import com.tarefa.carros.domain.Carro;
import com.tarefa.carros.domain.CarroEsportivo;
import com.tarefa.carros.domain.CarroSUV;
import com.tarefa.carros.service.GerenciadorCarros;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        CarroDAO<Carro> carroDAO = new CarroDAO<>();
        GerenciadorCarros<Carro> gerenciadorCarros = new GerenciadorCarros<>(carroDAO);

        
        boolean continuarCadastro = true;
        while (continuarCadastro) {
            System.out.println("Deseja cadastrar um novo carro? (sim/não)");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("não")) {
                continuarCadastro = false;
            } else {
                System.out.println("Digite o tipo de carro (1 - Esportivo, 2 - SUV): ");
                int tipo = Integer.parseInt(scanner.nextLine());

                System.out.println("Digite o modelo do carro: ");
                String modelo = scanner.nextLine();

                System.out.println("Digite a cor do carro: ");
                String cor = scanner.nextLine();

                Carro carro = null;
                if (tipo == 1) {
                    carro = new CarroEsportivo(modelo, cor);
                } else if (tipo == 2) {
                    carro = new CarroSUV(modelo, cor);
                } else {
                    System.out.println("Tipo de carro inválido.");
                    continue;
                }

                gerenciadorCarros.adicionarCarro(carro);

                System.out.println("Carro cadastrado com sucesso!");
            }
        }

        System.out.println("\nCarros cadastrados:");
        gerenciadorCarros.exibirCarros();

        scanner.close();
    }
}