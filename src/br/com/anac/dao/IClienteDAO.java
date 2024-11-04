package br.com.anac.dao;

import java.util.Collection;

import br.com.anac.domain.Cliente;

public interface IClienteDAO {
	
	public Boolean cadastrar(Cliente cliente);
	public void excluir(Long cpf);
	public void alterar(Long cliente);
	public Cliente consultar(Long cpf);
	public Collection<Cliente> buscarTodos();
	
}
