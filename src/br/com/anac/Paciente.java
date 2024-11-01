package br.com.anac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Parte 2
public class Paciente {

	public static void main(String[] args) {
		
		List<String> grupoMasculino = new ArrayList<>();
		List<String> grupoFeminino = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite seu nome e sexo conforme o exemplo a seguir: Luana - F, Marcos - M");
		System.out.println("Para ter acesso as listas apenas digite: Sair");
		
		while(true) {
			String paciente = s.nextLine();
				if (paciente.equalsIgnoreCase("sair")) {
				break;
				}
			String[] componente = paciente.split("-");
				if (componente.length !=2) {
				System.out.println("Entrada inválida. Coloque o traço entre o nome e o sexo.");
				continue;
				}
			String nome = componente[0].trim();
			String sexo = componente[1].trim().toUpperCase();
				if (sexo.equalsIgnoreCase("M")) {
					grupoMasculino.add(nome);
				} else if (sexo.equalsIgnoreCase("F")) {
					grupoFeminino.add(nome);
				} else {
					System.out.println("Entrada Inválida. Digite o sexo corretamente.");
				}
		}
		
		System.out.println("\n****GRUPO MASCULINO**** \n");
			for (String nome: grupoMasculino) {
				System.out.println(nome);
		}
		
		System.out.println("\n****GRUPO FEMININO**** \n");
			for (String nome: grupoFeminino) {
				System.out.println(nome);
		}
		
		s.close();
	}

}
