/*******************************************************************
 * Nom : Adam Benmoussa                                           *
 * Année d'étude : 12e année                                      *
 * Courriel : benada07@ecolecatholique.ca                         *
 * Titre : Travail 1 - Leçon 2.2                                  *
 * Cours : ICS4U - Génie informatique                             *
 * Date : Le Mercredi 25 septembre 2024                           *
 *******************************************************************/
import java.util.Scanner;

public class Travail1_Lecon_2_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est ton jour de naissance: ");
        int jourNaissance = scanner.nextInt();
        System.out.println("Quelle est ton mois de naissance (en nombre 1-12): ");
        int moisNaissance = scanner.nextInt();
        System.out.println("Quelle est ton annee de naissance: ");
        int anneeNaissance = scanner.nextInt();
        scanner.close();

        int calcAnneeAJours = (2024 - anneeNaissance) * 365; 
        int calcMoisAJours = (12 - moisNaissance) * 30;
        int totalJours = calcMoisAJours + calcAnneeAJours + jourNaissance;
        System.out.println("Ton age est de " + totalJours + " jours!");
        int totalJoursAHeures = totalJours * 24;
        double sleepTemps = totalJoursAHeures * 1/3;
        System.out.println("Le temps que tu as dormis en jours est de: "+ sleepTemps);
    }
}
