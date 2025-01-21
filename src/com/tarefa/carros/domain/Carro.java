package com.tarefa.carros.domain;

public abstract class Carro {
    private String modelo;
    private String cor;

    public Carro(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }
    
    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Cor: " + cor;
    }

    public abstract void ligar();
}