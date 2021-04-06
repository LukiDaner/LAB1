package pl.rzasa.firstapp;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner wartosc1 = new Scanner(System.in);
        Scanner wartosc2 = new Scanner(System.in);
        Scanner wartosc3 = new Scanner(System.in);
        Scanner wartosc4 = new Scanner(System.in);
        Scanner wartosc5 = new Scanner(System.in);

        System.out.print("Podaj wartosci dla tabeli: ");
        int a = wartosc1.nextInt();
        int b = wartosc2.nextInt();
        int c = wartosc3.nextInt();
        int d = wartosc4.nextInt();
        int e = wartosc5.nextInt();

        int[] tabela = new int[]{a,b,c,d,e};
        int[] alebat = new int[tabela.length];

        for (int i=0; i< tabela.length; i++)
            System.out.print(tabela[i]+ " ");

        System.out.println();

        for (int i=0; i < tabela.length; i++) {
            alebat[i] = tabela[tabela.length - 1 - i];
        }
        System.out.println();

        for (int i=0; i < alebat.length; i++)
            System.out.print(alebat[i] +" ");
    }
}
