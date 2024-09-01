package org.example;

import org.example.bancos.*;
import org.example.clientes.*;
import org.example.interfaces.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Cliente> clientes = Arrays.asList(
                new Cliente("Beltrano Silva", 543),
                new Cliente("Fulano Sicrano", 825),
                new Cliente("Plinio Borges", 423)
        );

        Banco bradesco = new Bradesco();
        Banco itau = new Itau();
        Banco caixa = new Caixa();

        clientes.get(0).setBanco(bradesco);
        clientes.get(1).setBanco(itau);
        clientes.get(2).setBanco(caixa);


        clientes.forEach(cliente -> {
            Optional<Banco> banco = cliente.getBanco();
            banco.ifPresent(banco_ -> banco_.depositar(cliente, 100));
        });

        clientes.forEach(cliente -> System.out.printf("nome: %s; \tagencia: %d;\tid: %d;\tsaldo: R$%.2f\n", cliente.getNome(), cliente.getAgencia(), cliente.getId(), cliente.getSaldo()));
    }
}