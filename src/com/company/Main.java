package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Įveskite žodį");
        Scanner sc = new Scanner(System.in);
        String zod = sc.nextLine();
        int kiekis = 0;
        boolean arSkaicius = false;
        try {
            Float.parseFloat(zod);
            arSkaicius = false;
            System.out.println("Įvesta ne žodis");
        } catch (Exception e) {
            arSkaicius =true ;


        }
        if(arSkaicius == true){
            abpaieska(zod,kiekis);

    }
}
    public static void abpaieska(String zod,int kiekis){
        try {

            for (int i = 0; i < zod.length(); i++) {
                char raide = zod.charAt(i);
                if (raide == 'a' || raide == 'A' && zod.charAt(i) < zod.length()) {
                    i++;
                    raide = zod.charAt(i);
                    if (raide == 'b' || raide == 'B') {
                        kiekis++;
                    }
                }
            }
        } catch (Exception a) {
            System.out.println("A paskutinė raidė");
        }
        System.out.println("Ab raidžių kiekis yra : " + kiekis);
    }
}


