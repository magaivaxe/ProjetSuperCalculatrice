package com.calculatrice.formesgeometriques.abstrate;

public class CircleAbs extends AbsFormeGeometrique implements IFormeGeometrique{
  // fields
  private double diametre;
  
  // constructor
  public CircleAbs(double diametre) {
    super();
    this.diametre = diametre;
  }

  @Override
  public double getArea() {
    double rayon = diametre / 2;
    return PI * Math.pow(rayon, 2);
  }

  // getters and setters
  public double getDiametre() {
    return diametre;
  }

  public void setDiametre(double diametre) {
    this.diametre = diametre;
  }

  @Override
  public double getPerimetre() {
    // TODO Auto-generated method stub
    return 0;
  }
  

}
