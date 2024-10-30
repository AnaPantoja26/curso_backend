package br.com.anac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paciente {
	public static void main(String args []) {
		List<String> grupoMasculino = new ArrayList<>();
		List<String> grupoFeminino = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite seu nome e sexo (Ex: Maria, Feminino ou João, Masculino)");
		System.out.println("Para sair e visualizar as listas é só digitar SAIR");
		
		while (true) {
			String paciente = s.nextLine();
			if (paciente.equalsIgnoreCase("sair")) {
				break;
			}
		
		String[] componente = paciente.split(",");
		if (componente.length !=2) {
			System.out.println("Entrada inválida. Não esqueça de colocar a vírgula! Use o formato: Nome, Sexo.");
			continue;
		}
		
		String nome = componente[0].trim();
		String sexo = componente[1].trim().toUpperCase();
		
		if (sexo.equalsIgnoreCase("Masculino")) {
			grupoMasculino.add(nome);
		} else if (sexo.equalsIgnoreCase("Feminino")) {
			grupoFeminino.add(nome);
		} else {
			System.out.println("Sexo Inválido! Digite corretamente");
		}
	}
	
	System.out.println("\nGrupo Masculino:");
	for (String nome : grupoMasculino) {
		System.out.println(nome);
	}
	
	System.out.println("\nGrupo Feminino:");
	for (String nome : grupoFeminino) {
		System.out.println(nome);
	}
	
	s.close();
	}
} 
