package com.calculatrice.formesgeometriques.abstrate;

public class TriangleAbs extends AbsFormeGeometrique implements IFormeGeometrique{
  // fields
  private double base;
  private double hauteur;
  
  // constructor
  public TriangleAbs(double base, double hauteur) {
    this.base = base;
    this.hauteur = hauteur;
  }
  
  @Override
  public double getArea() {
    return (base * hauteur) / 2;
  }
  
  // setters and getters
  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getHauteur() {
    return hauteur;
  }

  public void setHauteur(double hauteur) {
    this.hauteur = hauteur;
  }

  
}
