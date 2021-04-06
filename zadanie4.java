package pl.rzasa.firstapp;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner ilosc = new Scanner(System.in);

        System.out.println("Jak wysoka ma byc piramida?");

        int h = ilosc.nextInt();
        for (int i = 0; i < h; i++) {
            String star = "";
            for (int j = 0; j < i+1; j++)
                star += "*";
            System.out.println(star);
            }
        }
}
