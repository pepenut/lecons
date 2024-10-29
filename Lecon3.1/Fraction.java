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
	
	public Fraction (int num, int denom) {
		if (denom == 0) throw new IllegalArgumentException("Le denominateur peut pas etre egal a zero!");
        this.num = num;
        this.denom = denom;
        this.simplifier();
	} //fin constructeur Fraction
	
	public int getNum(){
		return num;		
	}
	public void setNum(int num) {
		this.num = num;
		this.simplifier();
	}

	public int getDenom() {
		return denom;
	}
	
	public void setDenom(int denom) {
		if (denom == 0) throw new IllegalArgumentException("Le denominateur peut pas etre egal a zero!");
		this.denom = denom;
		this.simplifier();
	}
	private void simplifier() {
		int pgcd = pgcd(Math.abs(num), Math.abs(denom));
		num /= pgcd;
		denom /= pgcd;
		if (denom < 0) { 
				num = -num;
				denom = -denom;
		}
}

	private int pgcd(int a, int b) {
		while (b != 0) {
				int temp = b;
				b = a % b;
				a = temp;
		}
		return a;
}
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
	
	public Fraction additionne(Fraction f) {
		int numA = this.num * f.denom + f.num * this.denom;
		int denomA = this.denom * f.denom;
		return new Fraction(numA, denomA);
	}

	public Fraction soustrait(Fraction f) {
		int numS = this.num * f.denom - f.num * this.denom;
		int denomS = this.denom * f.denom;
		return new Fraction(numS, denomS);
	}
	//Méthode multiplie
     //Multiplie la fraction même avec une 2e fraction f

		 public Fraction multiplie (Fraction f) {
		
			int numM = this.num * f.num;
			int denomM = this.denom * f.denom;
			Fraction fM = new Fraction (numM,denomM);
	
			return fM;
	
		} //fin méthode multiplie
	
		public Fraction divise(Fraction f) {
			if (f.num == 0) throw new IllegalArgumentException("Le denominateur peut pas etre egal a zero!");
			int numD = this.num * f.denom;
			int denomD = this.denom * f.num;
			return new Fraction(numD, denomD);
		}

		public int compare(Fraction f) {
			int diff = this.num * f.denom - f.num * this.denom;
			return Integer.compare(diff, 0); // 1 si supérieur, -1 si inférieur, 0 si égal
		}

    //Méthode additionne - à faire
		//Méthode soustrais - à faire    
		//Méthode divise - à faire
    //Méthode compare - à faire


		//Méthode main : Pour tester les méthodes 
    //de la classe Fraction

    public static void main(String[] args) {
			Fraction f1 = new Fraction(1, 3);
			Fraction f2 = new Fraction(2, 5);

			System.out.println("f1 : " + f1);
			System.out.println("f2 : " + f2);

			System.out.println("Addition: " + f1.additionne(f2));
			System.out.println("Soustraction: " + f1.soustrait(f2));
			System.out.println("Multiplication: " + f1.multiplie(f2));
			System.out.println("Division: " + f1.divise(f2));

			int comparison = f1.compare(f2);
			if (comparison > 0) {
					System.out.println("f1 est plus grand que f2");
			} else if (comparison < 0) {
					System.out.println("f1 est plus petit que f2");
			} else {
					System.out.println("f1 est egal a f2");
			}
	} //fin main
} //fin classe Fraction
