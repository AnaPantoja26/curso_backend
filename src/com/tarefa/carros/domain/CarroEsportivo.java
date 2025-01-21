package com.tarefa.carros.domain;

public class CarroEsportivo extends Carro {

	public CarroEsportivo(String modelo, String cor) {
		super(modelo, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("Carro esportivo " + getModelo() + " de cor " + getCor() + " ligado.");
	}

}
