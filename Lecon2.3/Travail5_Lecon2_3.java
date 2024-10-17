/*******************************************************************
 * Nom : Adam Benmoussa                                           *
 * Année d'étude : 12e année                                      *
 * Courriel : benada07@ecolecatholique.ca                         *
 * Titre : Travail 5 - Leçon 2.3                                  *
 * Cours : ICS4U - Génie informatique                             *
 * Date : Le Mercredi 25 septembre 2024                           *
 *******************************************************************/
 import java.util.Scanner;
 public class Travail5_Lecon2_3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    // Cryptage
    char lettreEAccentAigu='\u00E9';
    char lettreMinH='\u0068';
    char lettreAAccentAigu='\u00E0';
    System.out.println("Entrez message "+lettreAAccentAigu+" chiffrer: ");
    String message = scanner.nextLine();
    scanner.close();
    if (message.length()>1){ 
      char premierChar = message.charAt(0);
      char dernierChar = message.charAt(message.length()-1);
      String messageEncrypte = message.substring(1, message.length()-1) + dernierChar + premierChar + lettreEAccentAigu + lettreMinH;
      System.out.println("Message Encrypt"+lettreEAccentAigu +": " +messageEncrypte);
      // Décryptage
      String messageDecrypte = premierChar + messageEncrypte.substring(0, message.length()-1); 
      System.out.println("Message D" +lettreEAccentAigu+ "crypt"+lettreEAccentAigu+": "+messageDecrypte);
    } else {
      System.out.println("Le message est trop court");
    }
  }
}