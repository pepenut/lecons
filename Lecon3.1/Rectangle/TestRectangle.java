import java.util.Scanner; 

public class TestRectangle {   
	public static void main(String[] args) {   
		Rectangle rect1 = new Rectangle();   
		System.out.println("Les dimensions de ton rectangle sont " + rect1);   
		System.out.println("L'aire de ton rectangle est " + rect1.aire());   
		System.out.println("La base est " + rect1.getBase());      
		Scanner in = new Scanner(System.in);   
		System.out.print("\nQuelle est la base du nouveau rectangle? ");   
		int newBase = in.nextInt();   
		in.nextLine();   
		System.out.print("Quelle est la hauteur du nouveau rectangle? ");   
		int newHauteur = in.nextInt();   
		in.nextLine();   
		Rectangle rect2 = new Rectangle(newBase, newHauteur);   
		System.out.println("Les dimensions de ton nouveau rectangle sont " + rect2);   
		System.out.println("L'aire de ton nouveau rectangle est " + rect2.aire());   
		if(rect1.equals(rect2))    
			System.out.println("\nLes deux rectangles sont égaux.");   
		else    
			System.out.println("Les deux rectangles ne sont pas égaux.");      
		System.out.print("\nInsère une base?");   
		newBase = in.nextInt();   
		in.nextLine();   
		rect2.setBase(newBase);   
		System.out.println("Les nouvelles dimensions de ton rectangle sont " + rect2);     
	}  //fin méthode main
} //fin classe TestRectangle