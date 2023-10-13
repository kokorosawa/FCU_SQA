package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
  @Test
  void personTest() throws Exception {
    Person p = new Person("matt", 2003);
    p.setHeight(1.75);
    p.setWeight(73);
    p.getAge();
    p.getBmi();
  }
}