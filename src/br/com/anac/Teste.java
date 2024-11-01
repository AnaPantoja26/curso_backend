package br.com.anac;

public class Teste {
	public static void main(String args[]) {
		PessoaFisica pessoaUm = new PessoaFisica();
		pessoaUm.setNome("Maria");
		pessoaUm.setSobrenome("Lima");
		pessoaUm.setCpf("12345678912");
		pessoaUm.setContaPessoaFisica(33445.5d);
		pessoaUm.setValorPessoaFisica(100d);
		pessoaUm.setDebitoPessoaFisica(20d);
		System.out.println("Cliente: " + pessoaUm.getNome() + " " + pessoaUm.getSobrenome() + " " + "\nCPF: " + pessoaUm.getCpf() + "\nConta: " + pessoaUm.getContaPessoaFisica() + "\nValor: " + pessoaUm.getValorPessoaFisica() + "\nDébito: " + pessoaUm.getDebitoPessoaFisica() + "\nSaldo: " + pessoaUm.saldo());
	
	
		PessoaJuridica pessoaDois = new PessoaJuridica();
		pessoaDois.setNome("João");
		pessoaDois.setSobrenome("Lopes");
		pessoaDois.setCpf("89012345678");
		pessoaDois.setContaPessoaJuridica(88331.6d);
		pessoaDois.setValorPessoaJuridica(1000d);
		pessoaDois.setDebitoPessoaJuridica(600d);
		System.out.println("\n\nCliente: " + pessoaDois.getNome() + " " + pessoaDois.getSobrenome() + " " + "\nCPF: " + pessoaDois.getCpf() + "\nConta: " + pessoaDois.getContaPessoaJuridica() + "\nValor: " + pessoaDois.getValorPessoaJuridica() + "\nDébito: " + pessoaDois.getDebitoPessoaJuridica() + "\nSaldo: " + pessoaDois.saldo());;
	}
	
}
