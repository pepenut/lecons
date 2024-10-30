public class Rectangle {
  
  private int base;
  private int hauteur;
  
  public Rectangle() {
    this.base = 1;
    this.hauteur = 1;
  }
  public Rectangle(int b, int h) {
    this.base = b;
    this.hauteur = h;
  }
  public void setBase(int b){
    base = b;
  }
  public int getBase(){
    return base;
  }
  public void setHauteur(int h){
    hauteur = h; 
  }
  public int getHauteur(){
    return hauteur;
  }
  public int aire(){
    if (base==0){
      throw new IllegalArgumentException("Base ne peut pas etre zero");
    }
    if (hauteur==0){
      throw new IllegalArgumentException("Hauteur ne peut pas etre zero");
    }
    return base * hauteur;
  }
  public int perimetre(){
    if (base==0){
      throw new IllegalArgumentException("Base ne peut pas etre zero");
    }
    if (hauteur==0){
      throw new IllegalArgumentException("Hauteur ne peut pas etre zero");
    }
    return (2*base) + (2*hauteur);
  }
  public boolean equals(Rectangle r) {
    // À remplacer cote1 et cote2 par les expressions appropriées pour cette classe
    if(r.getBase() == base && r.getHauteur() == hauteur)
        return true;
    else
        return false;
  }
  public int compareTo(Rectangle r) {
    // si les rectangles sont égaux, retourne 0,
    // sinon retourne -1 ou 1 en comparant leurs aires
    if(r.equals(this))
        return 0;
    else if(r.aire() > this.aire())
        return -1;
    else
        return 1;
  } 
  public boolean estCarre(Rectangle r) {
    if (r.getBase() == r.getHauteur()){
      return true;
    }
    return false;
  }
  public String toString() {
    return "base=" + base + ", hauteur=" + hauteur;
  }// fin classe Rectangle
}