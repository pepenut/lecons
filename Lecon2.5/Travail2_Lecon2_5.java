/*******************************************************************
 * Nom : Adam Benmoussa *
 * Année d'étude : 12e année *
 * Courriel : benada07@ecolecatholique.ca *
 * Titre : Travail 2 - Leçon 2.5 *
 * Cours : ICS4U - Génie informatique *
 * Date : Le Mercredi 08 Octobre 2024 *
 *******************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Travail2_Lecon2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nombres = new ArrayList<>(); 
        for (int i=1; i<6; i++){
            System.out.println("Veuillez entrer le nombre "+i+":");
            int numToAdd = scanner.nextInt();
            nombres.add(numToAdd);
        }
        Collections.sort(nombres);
        
        System.out.println("Nombres tries: " + nombres);
        scanner.close();
    }
}