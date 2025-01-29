package br.com.anac;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		testeFiltraMulheres();
		testeSemMulheres();
		testeEntradaInvalida();		
	}
	
	public static void testeFiltraMulheres() {
		System.out.println("Testando filtragem...");
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Ana", "feminino"));
		pessoas.add(new Pessoa("Joao", "masculino"));
		pessoas.add(new Pessoa("Samanta", "mulher"));
		
		List<Pessoa> mulheres = filtrarMulheres1(pessoas);
		
		assert mulheres.size() == 2 : "Falha! Esperando 2 mulheres, mas encontrou " + mulheres.size();
		assert mulheres.get(0).getNome().equals("Ana") : "Falha! A primeira mulher esperada é Ana";
		assert mulheres.get(1).getNome().equals("Samanta") : "Falha! A segunda mulher esperada é Samanta";
	}
	
	private static List<Pessoa> filtrarMulheres1(List<Pessoa> pessoas) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void testeSemMulheres() {
		System.out.println("Testando sem mulheres...");
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Joao", "masculino"));
		
		List<Pessoa> mulheres = filtrarMulheres1(pessoas);
		assert mulheres.size() == 0 : "Falha! Esperado nenhuma mulher, mas encontrou " + mulheres.size();
	}
	
	public static void testeEntradaInvalida() {
        System.out.println("Testando entrada inválida...");
        
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Joao", null));
        
        List<Pessoa> mulheres = filtrarMulheres1(pessoas);
        assert mulheres.size() == 0 : "Falha! Entrada inválida não foi tratada corretamente";
    }
	
	public static List<Pessoa> filtrarMulheres(List<Pessoa> pessoas) {
        List<Pessoa> mulheres = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo() != null && (pessoa.getSexo().equals("feminino") || pessoa.getSexo().equals("mulher"))) {
                mulheres.add(pessoa);
            }
        }
        return mulheres;
    }

	
}
