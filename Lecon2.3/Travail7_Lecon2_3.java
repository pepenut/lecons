import java.util.*;
public class Travail7_Lecon2_3 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Entrez nombre entier: ");
      String entier = scanner.nextLine();
      char[] charArray = entier.toCharArray();
      int somme = 0;
      for (int i=0; i<entier.length(); i++){
        somme+=Integer.valueOf(Character.toString(charArray[i]));
      }
      System.out.println(somme);
  }
}
