package practiques;

import java.util.Scanner;

public class BandurriaHero {
    public static int puntuacio(String notesCorrectes){
        int puntuacioAcumulada = 0;
        int bonus = 10;
        for (int i = 0; i < notesCorrectes.length(); i++) {
            char actual = notesCorrectes.charAt(i);
            if (actual == 'O') {
                puntuacioAcumulada += bonus;
                bonus += 10;
            } else {
                bonus = 10;
            }
        }
        return puntuacioAcumulada;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int nombreCasos = in.nextInt();
        for (int i = 0; i < nombreCasos; i++) {
            String liniaBandurria = in.nextLine();
        }
    }
}
