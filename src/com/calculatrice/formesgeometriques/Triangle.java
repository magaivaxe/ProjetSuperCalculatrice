package com.calculatrice.formesgeometriques;

public class Triangle extends FormeGeometrique {
  // Fields
  private int hauteur;
  private int base;
  
  // Constructor by default
  public Triangle() { }
  // Constructor paramettré
  public Triangle(int hauteur, int base) {
    this.hauteur = hauteur;
    this.base = base;
  }
  
  // Methods
  public double aireCalculus() {
    return (base * hauteur) / 2;
  }
    
  // Setters and Getters
  public void setHauteur(int hauteur) {
    this.hauteur = hauteur;
  }
  
  public int getHauteur() {
    return this.hauteur;
  }
  
  public int getBase() {
    return base;
  }
  
  public void setBase(int base) {
    this.base = base;
  }
  
}
