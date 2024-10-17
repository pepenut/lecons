/*******************************************************************
 * Nom : Adam Benmoussa                                           *
 * Année d'étude : 12e année                                      *
 * Courriel : benada07@ecolecatholique.ca                         *
 * Titre : Travail 4 - Leçon 2.4                                  *
 * Cours : ICS4U - Génie informatique                             *
 * Date : Le Mercredi 02 Octobre 2024                             *
 *******************************************************************/
public class Travail4_Lecon2_4 {
    public static void main(String[] args) {
        String hashtag = "#";
        String espace = " ";

        for (int i = 1; i <= 5; i++) {
            int numEspace = i - 1;
            int j = 9 - (i - 1) * 2;
           
            System.out.println(espace.repeat(numEspace) + hashtag.repeat(j));
        }
    }
}