package br.com.anac;

//Trazer um objeto do mundo real e criar uma classe:

public class Paciente {
	
	//Propriedades da classe:
	
	public String nome;
	public String enderecoFilial;
	public String especialidade;
	public int idade;
	
	public Paciente(String nome, String enderecoFilial, String especialidade, int idade) {
		this.nome = nome;
		this.enderecoFilial = enderecoFilial;
		this.especialidade = especialidade;
		this.idade = idade;
	}
	
	//Método para obter nome do paciente:
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
        this.nome = nome;
    }
	
	//Método para obter o local da consulta:
	public String getEnderecoFilial() {
		return enderecoFilial;
	}
	
	public void setEnderecoFilial(String enderecoFilial) {
        this.enderecoFilial = enderecoFilial;
    }
	
	//Método para obter o local da consulta:
	public String getEspecialidade() {
		return especialidade;
	}
		
	public void setEspecialidade(String especialidade) {
	    this.especialidade = especialidade;
	}
	
	//Método para obter o local da consulta:
	public int getIdade() {
		return idade;
	}
			
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Método para exibir informações do paciente:
	
	public void exibirInformacoes () {
		System.out.println("Nome do Paciente:"+" " + nome);
		System.out.println("Localidade:"+" " + enderecoFilial);
		System.out.println("Especialidade:"+" " + especialidade);
		System.out.println("Idade do Paciente:"+" " + idade);
	}
	
	//Teste
	public static void main(String args[]) {
		Paciente pacienteNovo = new Paciente("João", "Hospital XXX. Travessa XXX, Nº 000", "dermatologista", 27);
		
		pacienteNovo.exibirInformacoes();
	}
	
	
																		    }
