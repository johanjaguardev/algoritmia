package org.algoritmos.operaciones;

public class Operaciones {
  public String seriePlus4Minus2(int number) {
    int num = 1;
    StringBuilder text = new StringBuilder("1");
    if (number != 1) {
      text.append(",");
      for (int i = 1; i < number; i++) {
        num = (i % 2 == 1) ? num + 4 : num - 2;
        text.append((i != number - 1) ? num + "," : num);
      }
    }
    return text.toString();
  }

}
