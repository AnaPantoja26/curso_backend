package br.com.anac;

public class PessoaFisica extends Pessoa {
	
	private Double contaPessoaFisica;
	private Double debitoPessoaFisica;
	private Double valorPessoaFisica;
	
	@Override
	public Double saldo() {
		return valorPessoaFisica-debitoPessoaFisica;
	}

	public Double getContaPessoaFisica() {
		return contaPessoaFisica;
	}

	public void setContaPessoaFisica(Double contaPessoaFisica) {
		this.contaPessoaFisica = contaPessoaFisica;
	}

	public Double getDebitoPessoaFisica() {
		return debitoPessoaFisica;
	}

	public void setDebitoPessoaFisica(Double debitoPessoaFisica) {
		this.debitoPessoaFisica = debitoPessoaFisica;
	}

	public Double getValorPessoaFisica() {
		return valorPessoaFisica;
	}

	public void setValorPessoaFisica(Double valorPessoaFisica) {
		this.valorPessoaFisica = valorPessoaFisica;
	}
	
}
