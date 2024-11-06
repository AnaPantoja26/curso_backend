package br.com.anac;

public abstract class Carro {
	
	private String potencia;
	private String combustivel;
	private String cor;
	
	public Carro(String potencia, String cor, String combustivel) {
		this.potencia = potencia;
		this.combustivel = combustivel;
		this.cor = cor;
	}
	
	public void iniciarIgnicao() {
		//Método getClass() -> ajuda a descobrir qual tipo de objeto enquanto o programa está rodando
		System.out.println(getClass().getSimpleName());
		//Método getSimpleName() -> é usado para obter o nome simples de uma classe em Java.
		System.out.println("\n***INICIAR IGNIÇÃO***" + "\nDADOS DO MOTOR:" + "\nCOMBUSTÍVEL: " + combustivel + "\nPOTÊNCIA: " + potencia);

	}
	
	public void limparCarro() {
		//Método toLowerCase() -> transformar todas as letras de uma string para minúsculas.
		System.out.println("***INICIAR LIMPEZA***" + "\nCOR:" + cor);
	}
	
	public void abastecerCarro() {
		//Método toLowerCase() -> transformar todas as letras de uma string para minúsculas.
		System.out.println("***INICIAR ABASTECIMENTO***" + "\nCOMBUSTIVEL:" + combustivel);
	}
}
