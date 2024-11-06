package br.com.anac;

public class Cliente {
	
	private String pedido;
	private boolean contrato;
	
	public Cliente(String pedido, boolean contrato) {
		this.pedido = pedido;
		this.contrato = contrato;
	}
	
	public boolean contrato() {
		return contrato;
	}
	
	public String getPedido() {
		return pedido;
	}

}
