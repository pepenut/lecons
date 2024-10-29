/*******************************************************************
 * Nom : Adam Benmoussa                                           *
 * Année d'étude : 12e année                                      *
 * Courriel : benada07@ecolecatholique.ca                         *
 * Titre : Travail 5 - Leçon 2.3                                  *
 * Cours : ICS4U - Génie informatique                             *
 * Date : Le Mercredi 25 septembre 2024                           *
 *******************************************************************/
import java.util.Random;
import java.util.Scanner;
 public class Travail6_Lecon2_3 {
   /*  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Entrez une phrase: ");
      String input = scanner.nextLine();
      scanner.close();
      input = input.replace(" ", "");
      int random = rand.nextInt(input.length());
      System.out.println(random);
      System.out.println(input);
      System.out.println("La lettre choisie au hasard est : "+input.charAt(random));
    } */ 
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      Random rand = new Random();
      System.out.println("Entrez une phrase: ");
      String input = scanner.nextLine();
      scanner.close();
      String input1[] = input.split(" ");
      int quelPhrase = rand.nextInt(input.length());
      System.out.println("Le mot choisi au hasard est : "+input1[quelPhrase]);
    }
}
