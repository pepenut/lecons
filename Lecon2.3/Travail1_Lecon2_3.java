/*******************************************************************
 * Nom : Adam Benmoussa                                           *
 * Année d'étude : 12e année                                      *
 * Courriel : benada07@ecolecatholique.ca                         *
 * Titre : Travail 1 - Leçon 2.3                                  *
 * Cours : ICS4U - Génie informatique                             *
 * Date : Le Mercredi 25 septembre 2024                           *
 *******************************************************************/
 public class Travail1_Lecon2_3 {
    public static void main(String[] args){
      char lettreEAccentGrave = '\u00E8';
      char lettreEAccentAigu = '\u00E9';
      String message ="Voici quelques \"caract"+lettreEAccentGrave+"res sp"+lettreEAccentAigu+"ciaux\"\n\tNouvelle ligne \'\\n\' \n\tTabulateur \'\\t\' \n\tApostrophe \'\\\'\'";
      System.out.println(message);
    }
 }