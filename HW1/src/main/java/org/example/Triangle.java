package org.example;

/**
 * This is Triangle class.
 * */
public class Triangle {
  /**
   * This is checkTriangle function.
   * */
  public String checkTriangle(int a, int b, int c) throws TriangleException {
    if (a <= 0 || b <= 0 || c <= 0) {
      throw new TriangleException("三角形的邊長不能小於 0");
    }

    if (a + b <= c || a + c <= b || b + c <= a) {
      throw new TriangleException("兩邊和不可小於第三邊");
    }

    if (a == b && b == c) {
      return "正三角形";
    } else if (a == b || b == c || c == a) {
      return "等腰三角形";
    } else {
      return "三角形";
    }
  }

}