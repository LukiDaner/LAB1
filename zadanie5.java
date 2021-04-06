package pl.rzasa.firstapp;
import  java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {
        Scanner ciag = new Scanner(System.in);
        Scanner czesc = new Scanner(System.in);

        System.out.println("Wprowadz swoj ciag: ");
        String wyraz = ciag.nextLine();
        System.out.println("Ktora czesc mam wyswietlic?");
        int cos = czesc.nextInt();
        int half = wyraz.length()/2;
        if (cos == 1){

            System.out.println(wyraz.substring(0,half));
        }
        if (cos == 2){

            System.out.println(wyraz.substring(half));
        }
    }
}
