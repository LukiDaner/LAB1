package pl.rzasa.firstapp;
import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args) {
        System.out.println("Podaj pierwsza temperature:");
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        System.out.println("Podaj druga temperature: ");
        int b= scan.nextInt();
        if (a < 100 || b < 100){
            System.out.println("Prawda");
        } else{
            System.out.println("Falsz");
        }
    }

}