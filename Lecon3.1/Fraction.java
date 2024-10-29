/*
 * FRACTIONS : Une fraction est un nombre avec un numérateur 
 * et un dénominateur tel que 1/3, 2/5 et 4 (un dénominateur 
 * de 1 n’est pas affiché).  Fais le design et la création de
 * code pour la classe Fraction. Il faut créer :
 *
 *       Au moins un constructeur - (déjà fait)
 *       Une méthode toString() - (déjà fait)
 *       Des méthodes accesseurs (setNum, getNum, 
 *                                setDenom, getDenom)
 *       Une méthode pour chacune des opérations sur deux 
 *       fractions additionne, soustrait, multiplie (déjà fait),
 *       divise
 * 
 *       Une méthode qui compare deux fractions pour déterminer
 *       lequel est plus grand
 *
 *       Indice: Tu devrais toujours stocker ta fraction 
 *       dans sa forme irréductible.
 *
 *       Une méthode main qui vérifie le fonctionnement 
 *       de TOUTES les méthodes de ta classe fraction
 */

 public class Fraction {

	//attributs

	private int num;
	private int denom;
	
	//constructeur
	
	Fraction (int num, int denom) {
		
		this.num = num;
		this.denom = denom;

	} //fin constructeur Fraction
	
     //Méthode getNum - à faire
     //Méthode setNum - à faire
     //Méthode getDenom - à faire
     //Méthode setDenom - à faire

     //Méthode to String
     //Affiche la fraction de la forme x/y
     //Affiche seulement x si y = 1

	public String toString() {
		
		if (denom == 1) {
			return "Fraction = " +this.num;
		} else {
			return "Fraction = " +this.num + "/" + this.denom;

		}
		
	} //fin méthode toString

	//Méthode multiplie
     //Multiplie la fraction même avec une 2e fraction f

	public Fraction multiplie (Fraction f) {
		
		int numM = this.num * f.num;
		int denomM = this.denom * f.denom;
		Fraction fM = new Fraction (numM,denomM);

		return fM;

	} //fin méthode multiplie

     //Méthode additionne - à faire
	//Méthode soustrais - à faire
     //Méthode divise - à faire
     //Méthode compare - à faire


	//Méthode main : Pour tester les méthodes 
     //de la classe Fraction

	public static void main(String[] args) {

          //Ajoute le code pour faire l’entrée de fraction
          //par l’utilisateur.  Utilise ces données pour tester
          //tes méthodes + - * /

		Fraction f1 = new Fraction(1,2);
		System.out.println(f1.toString());
		Fraction f2 = new Fraction(3,7);
		System.out.println(f2.toString());
		Fraction resultat = f1.multiplie(f2);
		System.out.println(resultat);

          //Ajoute des appels aux méthodes additionne, 
          //soustrais, et divise pour tester leur fonctionnement
		
	} //fin main

} //fin classe Fraction
