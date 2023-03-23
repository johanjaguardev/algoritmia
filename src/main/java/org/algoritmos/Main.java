package org.algoritmos;

import org.algoritmos.tablas.Tablas;

public class Main {
  public static void main(String[] args) {

    Tablas ejemploTablas = new Tablas();
    for(int n=1; n <=10; n++) {
      System.out.println(ejemploTablas.printMultiplicationTable(n));
    }
  }
}