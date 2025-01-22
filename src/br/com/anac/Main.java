package br.com.anac;

import java.lang.annotation.Annotation;

public class Main {
	public static void main(String[] args) {
		Class<?> class1 = Cliente.class;
		if (class1.isAnnotationPresent(Tabela.class)) {
			Tabela tabela = class1.getAnnotation(Tabela.class);
			
			System.out.println("Nome da tabela: " + tabela.value());
		} else {
			System.out.println("A anotação @Tabela não está presente na classe");
		}
	}
}
