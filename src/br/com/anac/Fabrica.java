package br.com.anac;

public abstract class Fabrica {
	
	public Carro create(String notaSolicitada1) {
		Carro carro = retirarCarro(notaSolicitada1);
		carro = prepararCarro(carro);
		return carro;
	}
	
	private Carro prepararCarro(Carro carro) {
		carro.limparCarro();
		carro.abastecerCarro();
		return carro;
	}
	
	abstract Carro retirarCarro(String notaSolicitada1);

}
