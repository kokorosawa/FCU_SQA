package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
  @Test
  void triangleTest() throws TriangleException {
    Triangle t = new Triangle();
    System.out.println(t.checkTriangle(3,3,3));
  }
}