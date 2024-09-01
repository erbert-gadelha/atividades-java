package org.example.bancos;

import org.example.clientes.Cliente;
import org.example.interfaces.Banco;

public class Itau implements Banco {

    private String nome = "Itau";
    private double taxa = 0.05;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getTaxa() {
        return taxa;
    }

    @Override
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public boolean sacar(Cliente cliente, double valor) {
        return Banco.super.sacar(cliente, valor * (1+taxa));
    }

    @Override
    public void depositar(Cliente cliente, double valor) {
        Banco.super.depositar(cliente, valor * (1-taxa));
    }
}
