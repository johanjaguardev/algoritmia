package org.algoritmos.tablas;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TablasTest {

  @Test
  public void testMultiplicationTable() {

    Tablas tablas = new Tablas();
    List<Executable> assertions = new ArrayList<>();
    for(int number = 1; number<= 10; number ++) {
      String tabla = "";
      for(int i = 1; i <= 10; i++) {
        tabla += i + "x" + number + " = " + String.valueOf(number * i) + "\n";
      }
      String finalTabla = tabla;
      int finalNumber = number;
      assertions.add(() -> assertEquals(finalTabla, tablas.printMultiplicationTable(finalNumber)));
    }
    assertAll("Tablas", assertions);
  }
}