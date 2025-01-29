package br.com.anac.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test.*;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

public class Test {

    private List<Pessoa> pessoas;

    @BeforeEach
    public void setup() {
        
        pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", "feminino"));
        pessoas.add(new Pessoa("Joao", "masculino"));
        pessoas.add(new Pessoa("Samanta", "mulher"));
    }

    
    public void testFiltraMulheres() {
        List<Pessoa> mulheres = filtrarMulheres(pessoas);

        
        assertEquals(2, mulheres.size(), "Esperado 2 mulheres, mas encontrou " + mulheres.size());
        assertEquals("Ana", mulheres.get(0).getNome(), "A primeira mulher esperada é Ana");
        assertEquals("Samanta", mulheres.get(1).getNome(), "A segunda mulher esperada é Samanta");
    }

    @org.junit.jupiter.api.Test
    public void testSemMulheres() {
        List<Pessoa> pessoasSemMulheres = new ArrayList<>();
        pessoasSemMulheres.add(new Pessoa("Joao", "masculino"));

        List<Pessoa> mulheres = filtrarMulheres(pessoasSemMulheres);

        assertEquals(0, mulheres.size(), "Esperado nenhuma mulher, mas encontrou " + mulheres.size());
    }

    @org.junit.jupiter.api.Test
    public void testEntradaInvalida() {
        List<Pessoa> pessoasInvalidas = new ArrayList<>();
        pessoasInvalidas.add(new Pessoa("Joao", null));

        List<Pessoa> mulheres = filtrarMulheres(pessoasInvalidas);

        assertEquals(0, mulheres.size(), "Entrada inválida não foi tratada corretamente");
    }

    public List<Pessoa> filtrarMulheres(List<Pessoa> pessoas) {
        List<Pessoa> mulheres = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo() != null && (pessoa.getSexo().equals("feminino") || pessoa.getSexo().equals("mulher"))) {
                mulheres.add(pessoa);
            }
        }
        return mulheres;
    }
}
