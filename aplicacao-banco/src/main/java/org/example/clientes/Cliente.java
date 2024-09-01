package org.example.clientes;

import org.example.interfaces.Banco;

import java.util.Optional;

public class Cliente {
    static int id_;

    private double saldo;
    private int id;
    private String nome;
    private int agencia;
    private Optional<Banco> banco;

    public Cliente() {
        this.nome = "undefined";
        this.agencia = -1;
        saldo = 0;
        this.id = ++id_;
        banco = Optional.empty();
    }

    public Cliente(String nome, int agencia) {
        this.nome = nome;
        this.agencia = agencia;
        saldo = 0;
        this.id = ++id_;
        banco = Optional.empty();
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public Optional<Banco> getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = Optional.of(banco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}
