package br.com.anac;

public class Teste {

	public static void main(String args[]) {
		Cliente cliente = new Cliente("A", false);
		Fabrica fabrica = getFabrica(cliente);
		Carro carro = fabrica.create(cliente.getPedido());
		carro.iniciarIgnicao();
	}
	
	private static Fabrica getFabrica(Cliente cliente) {
		if (cliente.contrato()) {
			return new ComContratoFabrica();
		} else {
			return new SemContratoFabrica();
		}
	}
}
