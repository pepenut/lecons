import java.util.Scanner;
public class Travail1_Lecon2_6 {
  public static void main (String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entrez le mois: ");
    int mois = scanner.nextInt();
    saisons(mois);
  }
  public static void saisons(int month){
    switch (month) {
      case 3:
      case 4:
      case 5:
        System.out.print("Printemps");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("Ete");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("Automne");
        break;
      case 12:
      case 1:
      case 2:
        System.out.println("Hiver");
        break;
      default:
        System.out.println("Invalide");
        break;
    }
  }
}