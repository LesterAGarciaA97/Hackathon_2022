package org.hackathon;

import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String cadena01 = sc.nextLine();
        System.out.println("Introduce otra cadena");
        String cadena02 = sc.nextLine();

        for (int i = 0; i < cadena01.length(); i++) {
            for (int j = i + 1; j <= cadena01.length(); j++) {
                String r = cadena01.substring(i, j);
                lista1.add(r);
            }
        }
        for (int i = 0; i < cadena02.length(); i++) {
            for (int j = i + 1; j <= cadena02.length(); j++) {
                String r = cadena02.substring(i, j);
                lista2.add(r);
            }
        }

        Collections.sort(lista1);
        Collections.sort(lista2);

        if(lista1 == lista2){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}