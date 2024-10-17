/*******************************************************************
 * Nom : Adam Benmoussa *
 * Année d'étude : 12e année *
 * Courriel : benada07@ecolecatholique.ca *
 * Titre : Travail 1 - Leçon 2.5 *
 * Cours : ICS4U - Génie informatique *
 * Date : Le Mercredi 08 Octobre 2024 *
 *******************************************************************/
import java.util.Scanner;
import java.util.Random;

public class Travail1_Lecon2_5 {
    public static void main(String[] args) {
        int taille;
        int[] tableauA;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Indique une taille SVP: ");
        taille = Integer.valueOf(scanner.nextLine());
        scanner.close();
        tableauA = new int[taille];
        Random random = new Random();
        
        System.out.println("Les valeurs du tableau sont:");
        for (int i=0; i<taille; i++ ){
          tableauA [i]= random.nextInt(10);
          System.out.println(tableauA[i]);
        }
    }
}