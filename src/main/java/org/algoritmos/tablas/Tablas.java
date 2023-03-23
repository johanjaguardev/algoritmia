package org.algoritmos.tablas;

public class Tablas {
  public String printMultiplicationTable(int number) {
    StringBuilder tabla = new StringBuilder();
    for(int i = 1; i<= 10; i ++) {
      tabla.append(i).append("x").append(number).append(" = ").append(number * i).append("\n");
    }
    return tabla.toString();
  }
}
