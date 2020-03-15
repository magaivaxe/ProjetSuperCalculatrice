package com.calculatrice.formesgeometriques;

public class FormeGeometrique {
  // fields
  double perimetre;
  
  // constructors
  public FormeGeometrique() { }
  
  public FormeGeometrique(double perimetre) {
    this.perimetre = perimetre;
  }
  // methods
  
  // getters setters
  public double getPerimetre() {
    return this.perimetre;
  }
  
  public void setPerimetre(double perimetre) {
    this.perimetre = perimetre;
  }
  
  public double getPerimetrePuissance() {
    return Math.pow(perimetre, 2);
  }
  
}
