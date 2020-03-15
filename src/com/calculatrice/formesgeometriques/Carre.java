package com.calculatrice.formesgeometriques;

public class Carre extends FormeGeometrique {

  private double cote;
  
  public Carre() {
    super();
  }
  
  public Carre(double cote) {
    super(4 * cote);
    this.cote = cote;
  }
  
  public double miPerimetre() {
    return perimetre / 2;
  }
}
