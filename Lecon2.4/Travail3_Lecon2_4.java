
/*******************************************************************
 * Nom : Adam Benmoussa                                           *
 * Année d'étude : 12e année                                      *
 * Courriel : benada07@ecolecatholique.ca                         *
 * Titre : Travail 3 - Leçon 2.4                                  *
 * Cours : ICS4U - Génie informatique                             *
 * Date : Le Mercredi 25 septembre 2024                           *
 *******************************************************************/
import java.util.Scanner;

public class Travail3_Lecon2_4 {
   public static void main(String[] args) {
      char lettreAMinAccentGrave = '\u00E0';
      char lettreEMinAccentGrave = '\u00E8';
      char lettreAAccentGrave = '\u00C0';
      char lettreEAccentCirconflexe = '\u00EA';
      Scanner scanner = new Scanner(System.in);
      System.out.println("Quelle taille fait tu? (en cm): ");
      int taille = Integer.valueOf(scanner.nextLine());
      if (taille >= 122 && taille <= 188) {
         System.out.println("" + lettreAAccentGrave + "-tu des maux de t" + lettreEAccentCirconflexe + "tes? (O ou N)");
         String maux = scanner.nextLine();
         maux.toUpperCase();
         System.out.println("" + lettreAAccentGrave + "-tu des malaise cardiaques? (O ou N)");
         String malaise = scanner.nextLine();
         malaise.toUpperCase();
         if (maux.equals("N") && malaise.equals("N")) {
            System.out.println("Bienvenue " + lettreAMinAccentGrave + " bord");
         } else {
            System.out
                  .println("Il n'est pas securitaire pour toi de t'installer " + lettreAMinAccentGrave + " bord du man"
                        + lettreEMinAccentGrave + "ge.");
         }
      } else {
         System.out.println("Il n'est pas securitaire pour toi de t'installer " + lettreAMinAccentGrave + " bord du man"
               + lettreEMinAccentGrave + "ge.");
      }
      scanner.close();
   }
}