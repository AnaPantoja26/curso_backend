package com.tarefa.carros.dao;

import java.util.ArrayList;
import java.util.List;

public class CarroDAO<T> {
	private List<T> carros = new ArrayList<>();
   
    public void salvar(T carro) {
        carros.add(carro);
    }

    public List<T> listar() {
        return carros;
    }
}