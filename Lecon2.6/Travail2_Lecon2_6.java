
import java.util.Scanner;

public class Travail2_Lecon2_6 {
  public static void main (String [] args){
    double largeur = lireDonnee("largeur");
    double hauteur = lireDonnee("hauteur");

    boolean donneesOk = testerDonnees(largeur, hauteur);

    if (donneesOk) {
      calculer(largeur, hauteur);
    } else {
      afficherErreur();
    }
  }
  public static void afficherErreur(){
    System.out.println("Erreur: vous avez introduit une largeur ou une hauteur négative ou nulle!");
  }
  public static double lireDonnee(String string){
    Scanner scanner = new Scanner(System.in);
    if (string.equals("largeur")){
      System.out.println("Entrez la largeur (en m): ");
      return scanner.nextDouble();
    } else {
      System.out.println("Entrez la hauteur (en m): ");
      return scanner.nextDouble();
    }
  }
  public static boolean testerDonnees(double width, double height){
    return (width>0 && height>0);
  }
  public static void calculer(double width, double height){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Surface ('s/S') ou perimetre ('p/P')?: ");
    String choix = scanner.nextLine();
    switch (choix.toUpperCase()) {
      case "S":
        double surface = width * height;
        System.out.println("La surface est de: "+surface+" m2");
        break;
      case "P":
        double perimetre = (width * 2) + (height * 2);
        System.out.println("Le perimetre est de: "+perimetre+" m");
        break; 
      default:
        System.out.println("Invalide");
        break;
    }
  }
}