package com.sda.algorytmy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie {

    public static void zadanie1 (List<String> listaImion, String imie){
        listaImion.add(imie);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> listaImion = new ArrayList<>();
        String imie;


        while (true){
            System.out.println("Podaj imie:");
            imie = scanner.next();
            if (imie.equals("-")){
                break;
            }
            zadanie1(listaImion, imie);
        }

//        //Wersja DO WHILE
//        do {
//            System.out.println("Podaj imie:");
//            imie = scanner.nextLine();
//            zadanie1(listaImion, imie);
//        } while (!imie.equals("-"));
//
//        listaImion.remove("-");


        System.out.println("Lista imion: ");
        for (String el : listaImion){
            System.out.println(el);

        }
    }
}
