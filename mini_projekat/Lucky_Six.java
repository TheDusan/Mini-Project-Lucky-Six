package peta_nedelja.mini_projekat;

import java.util.Random;
import java.util.Scanner;

public class Lucky_Six {
    private final static Scanner scanner = new Scanner(System.in); // staticki skener, da ga ne prosledjujem

    public static void main(String[] args) {
        int[] dobitna = unesiKombinaciju();
        int[] tiket = generisiTiket();
        bingo(dobitna, tiket);

    }

    public static int[] unesiKombinaciju() {
        int[] dobitna = new int[6];

        for (int i = 0; i < dobitna.length; i++) {
            boolean validanUnos = false;
            while (!validanUnos) {
                System.out.printf("Unesite %d. broj:\n", i + 1);
                int unos = Integer.parseInt(scanner.nextLine());

                if (unos < 1 || unos > 48) {
                    System.out.println("Uneti broj mora biti u rasponu od 1 do 48.");
                } else if (postojiDuplikat(dobitna, unos, i)) {
                    System.out.println("Broj je vec unesen. Unesite neki drugi broj.");
                } else {
                    dobitna[i] = unos;
                    validanUnos = true;
                }
            }
        }
        return dobitna;
    }

    public static int[] generisiTiket() {
        int[] brojevi = new int[30];
        Random random = new Random();

        for (int i = 0; i < brojevi.length; i++) {
            brojevi[i] = random.nextInt(48) + 1;
        }

        return brojevi;
    }

    // postovacu nazive metoda, ali ovo meni vise lici na luxky six :D
    public static void bingo(int[] niz1, int[] niz2) {
        int pogotci = 0;

        for (int i = 0; i < niz1.length; i++) {
            for (int j = 0; j < niz2.length; j++) {
                if (niz1[i] == niz2[j]) {
                    pogotci++;
                    break;
                }
            }
        }

        if (pogotci == niz1.length) {
            System.out.println("Vi ste srecni dobitnik!");
        } else {
            System.out.println("Broj pogodaka: " + pogotci);
        }
    }



    // pomocna metoda za unos brojeva
    private static boolean postojiDuplikat(int[] dobitna, int broj, int brojElemenata) {
        for (int i = 0; i < brojElemenata; i++) {
            if (dobitna[i] == broj) {
                return true;
            }
        }
        return false;
    }


}