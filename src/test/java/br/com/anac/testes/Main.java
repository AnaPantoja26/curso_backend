package br.com.anac.testes;

import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.println("Digite o nome e sexo (separados por vírgula). Digite 'fim' para encerrar.");
		
		while(true) {
			String input = scanner.nextLine();
			
			if (input.equalsIgnoreCase("fim")) {
				break;
			}
			
			String[] dados = input.split(",");
			
			if (dados.length == 2) {
				String nome = dados[0].trim();
				String sexo = dados[1].trim().toLowerCase();
				
				if (sexo.equals("feminino") || sexo.equals("mulher")) {
					pessoas.add(new Pessoa(nome, sexo));
				} else {
					pessoas.add(new Pessoa(nome, sexo));
				}
			} else {
				System.out.println("Entrada inválida. Tente novamente");
			}
		
		}
		
		List<Pessoa> mulheres = pessoas.stream()
				.filter(p -> p.getSexo().equals("feminino") || p.getSexo().equals("mulher"))
				.collect(Collectors.toList());
		
		boolean allWomen = mulheres.stream()
				.allMatch(p -> p.getSexo().equals("feminino") || p.getSexo().equals("mulher"));
		if (allWomen) {
			System.out.println("A lista contém apenas mulheres.");
		} else {
			System.out.println("A lista contém pessoas de outro sexo.");
		}
		
		System.out.println("Lista de Mulheres");
		if (!mulheres.isEmpty()) {
			mulheres.forEach(p -> System.out.println(p.getNome()));
		} else {
			System.out.println("Nenhuma mulher encontrada");
		}
	}
}
