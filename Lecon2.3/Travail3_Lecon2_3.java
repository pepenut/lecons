/*******************************************************************
 * Nom : Adam Benmoussa                                           *
 * Année d'étude : 12e année                                      *
 * Courriel : benada07@ecolecatholique.ca                         *
 * Titre : Travail 3 - Leçon 2.3                                  *
 * Cours : ICS4U - Génie informatique                             *
 * Date : Le Mercredi 25 septembre 2024                           *
 *******************************************************************/
import java.util.Scanner;

 public class Travail3_Lecon2_3 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      String phrase = "";
      while (!(phrase.equals("fini"))){
         System.out.println("Entre ta phrase: "); //Demande à l'utilisateur d'entrer leur phrase
         phrase = input.nextLine();
         int nombreCaracteres = phrase.length();
         System.out.println(nombreCaracteres); 
      }
      scanner.close();
   }
 }