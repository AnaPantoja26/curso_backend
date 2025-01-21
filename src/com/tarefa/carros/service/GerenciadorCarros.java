package com.tarefa.carros.service;

import com.tarefa.carros.dao.CarroDAO;
import java.util.List;

public class GerenciadorCarros<T> {

    private CarroDAO<T> carroDAO;

    public GerenciadorCarros(CarroDAO<T> carroDAO) {
        this.carroDAO = carroDAO;
    }

    public void adicionarCarro(T carro) {
        carroDAO.salvar(carro);
    }

    public void exibirCarros() {
        List<T> carros = carroDAO.listar();
        for (T carro : carros) {
            System.out.println(carro);
        }
    }
}