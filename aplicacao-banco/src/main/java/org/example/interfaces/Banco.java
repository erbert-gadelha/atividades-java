package org.example.interfaces;

import org.example.clientes.Cliente;

public interface Banco {

    public default String getNome() {
        return "undefined";
    }
    public default void setNome(String nome) {

    }

    public default double getTaxa() { return 0; }
    public default void setTaxa(double taxa) {};

    public default boolean sacar(Cliente cliente, double valor) {
        if(cliente.getSaldo() < valor)
            return false;

        cliente.setSaldo(cliente.getSaldo() - valor);
        return true;
    }

    public default void depositar(Cliente cliente, double valor) {
        cliente.setSaldo(cliente.getSaldo() + valor);
    }
}
