package pl.rzasa.firstapp;
public class zadanie2 {
    public static void main(String[] args) {
        int[] sekwencja = {16, 18, 25, 1, 2, 3, 40, 53, 8, 7, 4, 90};
        for (int i = 0; i < sekwencja.length; i++){
            System.out.println("Sekwencja to: " + sekwencja[i]+ ", " + sekwencja[i+1] + ", " + sekwencja[i+2]);
            if (sekwencja[i]==1){
                if (sekwencja[i+1]==2) {
                    if(sekwencja[i+2]==3){
                        System.out.println("PRAWDA!");
                        break;
                    }
                }
            }else{
                System.out.println("FALSZ!");
            }
        }

    }
}