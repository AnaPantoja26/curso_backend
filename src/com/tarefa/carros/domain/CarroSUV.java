package com.tarefa.carros.domain;

public class CarroSUV extends Carro {

	public CarroSUV(String modelo, String cor) {
		super(modelo, cor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("Carro SUV " + getModelo() + " de cor " + getCor() + " ligado.");
	}

}
