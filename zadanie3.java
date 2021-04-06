package pl.rzasa.firstapp;

import java.util.Scanner;

public class zadanie3 {
    public static void main(String[] args){
        Scanner bok_a = new Scanner(System.in);
        Scanner bok_b = new Scanner(System.in);
        Scanner bok_c = new Scanner(System.in);

        System.out.println("Podaj wartosc boku a: ");
        int a = bok_a.nextInt();
        System.out.println("Podaj wartosc boku b: ");
        int b = bok_b.nextInt();
        System.out.println("Podaj wartosc boku c: ");
        int c = bok_c.nextInt();

        if (a*a + b*b == c*c){
            System.out.println("Trojkat jest prostokatny");
        } else{
            System.out.println("Trojkat nie jest prostokatny");
        }
    }
}
