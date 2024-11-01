package br.com.anac;

public class PessoaJuridica extends Pessoa {
		
	private Double contaPessoaJuridica;
	private Double debitoPessoaJuridica;
	private Double valorPessoaJuridica;
		
	public Double getContaPessoaJuridica() {
		return contaPessoaJuridica;
	}

	public void setContaPessoaJuridica(Double contaPessoaJuridica) {
		this.contaPessoaJuridica = contaPessoaJuridica;
	}

	public Double getDebitoPessoaJuridica() {
		return debitoPessoaJuridica;
	}

	public void setDebitoPessoaJuridica(Double debitoPessoaJuridica) {
		this.debitoPessoaJuridica = debitoPessoaJuridica;
	}

	public Double getValorPessoaJuridica() {
		return valorPessoaJuridica;
	}

	public void setValorPessoaJuridica(Double valorPessoaJuridica) {
		this.valorPessoaJuridica = valorPessoaJuridica;
	}

	@Override
	public Double saldo() {
		return valorPessoaJuridica-debitoPessoaJuridica;
	}
	
}
