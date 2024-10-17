/*******************************************************************
 * Nom : Adam Benmoussa                                           *
 * Année d'étude : 12e année                                      *
 * Courriel : benada07@ecolecatholique.ca                         *
 * Titre : Travail 4 - Leçon 2.3                                  *
 * Cours : ICS4U - Génie informatique                             *
 * Date : Le Mercredi 25 septembre 2024                           *
 *******************************************************************/
import java.util.Scanner;

public class Travail4_Lecon2_3 {
    public static void main(String[] args) {
        char lettreEAccentAigu='\u00E9';
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entrez une phrase :"); 
        String phrase = scanner.nextLine(); 
        
        System.out.println("Index de d"+lettreEAccentAigu+"but :");
        int indexDebut = scanner.nextInt();     
        while (indexDebut>phrase.length()){
            System.out.println("Erreur");
            System.out.println("Index de d"+lettreEAccentAigu+"but :");
            indexDebut = scanner.nextInt();
        }
        System.out.println("Index de fin :");
        int indexFin = scanner.nextInt();
        while (indexFin>phrase.length()){
            System.out.println("Erreur");
            System.out.println("Index de fin :");
            indexFin = scanner.nextInt();
        }    
        scanner.close();
        
        String gamme = phrase.substring(indexDebut, indexFin);
        System.out.println("La gamme: "+gamme);
    }
}
