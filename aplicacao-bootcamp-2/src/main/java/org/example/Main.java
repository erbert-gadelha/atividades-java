package org.example;

import org.example.entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Bootcamp bootcamp = new Bootcamp("Java", "Aulão Java.", createDate("10/10/2024"), createDate("25/10/2024"));
        bootcamp.getActivities().add(new Activity("POO", "Interfaces e encapsulamento.", 5));
        bootcamp.getActivities().add(new Activity("Web", "Protocólos de Rede.", 2));
        bootcamp.getActivities().add(new Activity("Spring", "Configurando dempendencias.", 3));



        Dev dev = new Dev("Professor Carvalho");
        dev.subscribe(bootcamp);

        System.out.printf("Dev: %s;\tEXP:%d;\n", dev.getName(), dev.totalXP());

        while (!dev.getWatching().isEmpty()) {
            dev.progress();
            System.out.printf("Dev: %s;\tEXP:%d;\n", dev.getName(), dev.totalXP());
        }

    }


    public static Date createDate(String s) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return formatter.parse(s);
        } catch (ParseException e) {
            //e.printStackTrace();
        }

        return new Date();
    }
}