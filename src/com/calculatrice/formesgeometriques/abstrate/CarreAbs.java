package com.calculatrice.formesgeometriques.abstrate;

public class CarreAbs extends AbsFormeGeometrique implements IFormeGeometrique{
  // fields
  private double cote;
  
  //constructors
  public CarreAbs(double cote) {
    super();
    this.cote = cote;
  }

  // methods
  @Override
  public double getArea() {
    return Math.pow(cote, 2);
  }

  //getters and setters
  public double getCote() {
    return cote;
  }

  public void setCote(double cote) {
    this.cote = cote;
  }
  
  
}
