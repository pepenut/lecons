/*******************************************************************
 * Nom : Adam Benmoussa *
 * Année d'étude : 12e année *
 * Courriel : benada07@ecolecatholique.ca *
 * Titre : Travail 3 - Leçon 2.5 *
 * Cours : ICS4U - Génie informatique *
 * Date : Le Mercredi 08 Octobre 2024 *
 *******************************************************************/
import java.util.ArrayList;

public class Travail3_Lecon2_5 {

	public static void main(String[] args) {
		String[][] eleves = {
				{"Julie Uno", "67", "89", "56", "78"},
				{"Martin Dos", "89", "90", "90", "72"},
				{"Henri Tres", "55", "45", "68", "90"},
				{"Lucie Quatro", "100", "34", "77", "80"}
		};
		
		ArrayList<String> honneur = new ArrayList<>();
		
		for (int i = 0; i < eleves.length; i++) {
			int note1 = Integer.parseInt(eleves[i][1]);
			int note2 = Integer.parseInt(eleves[i][2]);
			int note3 = Integer.parseInt(eleves[i][3]);
			int note4 = Integer.parseInt(eleves[i][4]);
			int noteFinale = (note1 + note2 + note3 + note4) / 4;
			
			System.out.println(eleves[i][0] + " a une note finale de " + noteFinale + "%.");
			if (noteFinale >= 80) {
				honneur.add(eleves[i][0]);
			}
		}
		System.out.println("Tableau d'honneur: "+honneur);
	}
}

