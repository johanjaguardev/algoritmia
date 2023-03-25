package org.algoritmos.operaciones;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperacionesTest {

  @Test
  public void testSeriePLus4Minus2() {
    Operaciones op = new Operaciones();
    assertEquals("1", op.seriePlus4Minus2(1));
    assertEquals("1", op.seriePlus4Minus2(1));
    assertEquals("1,5,3,7,5,9", op.seriePlus4Minus2(6));
    assertEquals("1,5,3,7,5,9,7,11,9,13", op.seriePlus4Minus2(10));
  }
}