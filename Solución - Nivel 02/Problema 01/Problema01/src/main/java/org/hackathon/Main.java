package org.hackathon;

import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena");
        String cadena01 = sc.nextLine();
        System.out.println("Introduce otra cadena");
        String cadena02 = sc.nextLine();

        if(cadena01.contains(cadena02) && cadena02.contains(cadena01)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}