package org.example;
import org.example.models.Pessoa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Jaque", 25);
        Pessoa p2 = new Pessoa("Alex", 24);
        Pessoa p3 = new Pessoa("Rose", 58);
        Pessoa p4 = new Pessoa("Edvaldo", 60);
        Pessoa p5 = new Pessoa("Claudia", 49);
        Pessoa p6 = new Pessoa("Zezinho", 18);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);
        pessoas.add(p6);

        System.out.println("======================");
        pessoas.forEach(p -> System.out.println(p.getName()));
        System.out.println("======================\n");

        //Utilizando Comparator não precisamos implementar Comparable em Pessoa
        //pessoas.sort(Comparator.comparing(p -> p.getName()));

        pessoas.sort(Comparator.comparing(p -> p.getAge()));

        //deste modo precisamos implmementar Comparable em Pessoas
        //Collections.sort(pessoas);

        System.out.println("======================");
        pessoas.forEach(p -> System.out.println(p.getName() + " - " + p.getAge()));
    }
}