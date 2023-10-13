package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
  @Test
  public void testCheckTriangle() throws TriangleException {
    assertEquals("正三角形", new Triangle().checkTriangle(3, 3, 3));
    assertEquals("等腰三角形", new Triangle().checkTriangle(3, 3, 5));
    assertEquals("三角形", new Triangle().checkTriangle(3, 4, 5));
  }

  @Test
  public void testCheckTriangleNegative() throws TriangleException {
    new Triangle().checkTriangle(-1, 2, 3);
  }

  @Test
  public void testCheckTriangleNotTriangle() throws TriangleException {
    new Triangle().checkTriangle(1, 2, 6);
  }

}