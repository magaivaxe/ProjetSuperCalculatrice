package com.calculatrice.application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.calculatrice.formesgeometriques.Carre;
import com.calculatrice.formesgeometriques.FormeGeometrique;
import com.calculatrice.formesgeometriques.Triangle;
import com.calculatrice.formesgeometriques.abstrate.CarreAbs;
import com.calculatrice.formesgeometriques.abstrate.CircleAbs;
import com.calculatrice.formesgeometriques.abstrate.IFormeGeometrique;
import com.calculatrice.formesgeometriques.abstrate.TriangleAbs;

public class Application {

  public static void main(String[] args) {
    Triangle myTriangle = new Triangle();
    
    myTriangle.setHauteur(3);
    myTriangle.setBase(5);
    System.out.println(myTriangle.aireCalculus());
    
    Carre myCarre = new Carre(2.2);
    System.out.println(myCarre.miPerimetre());
    
    
    myCarre.getPerimetrePuissance();
    FormeGeometrique formeGeometrique = new Carre();
    formeGeometrique.getPerimetrePuissance();
    
    List<FormeGeometrique> listFormes = new ArrayList<>();
    listFormes.add(new Carre());
    listFormes.add(new Triangle());
    
    // ****************************************************************************
    
    IFormeGeometrique formeCircle = new CircleAbs(4.2);
    IFormeGeometrique formeTriangle = new TriangleAbs(0.98, 5.13);
    IFormeGeometrique formeCarre = new CarreAbs(3.48);
    List<IFormeGeometrique> listFormeGeometriques = new ArrayList<>();
    
    listFormeGeometriques.add(formeCarre);
    listFormeGeometriques.add(formeCircle);
    listFormeGeometriques.add(formeTriangle);
    
    listFormeGeometriques.forEach((forme) -> {
      
    });
    
    for (IFormeGeometrique f : listFormeGeometriques) {
      System.out.println(f.getClass().getSimpleName() + ": " + f.getArea());
    }
    
    
  }

}
