package org.example;

import org.example.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
  private Person p;

  @BeforeEach
  public void setUp() throws Exception {
    p = new Person("matt", 2003);
  }

  @Test
  public void testSetHeight() throws Exception {
    p.setHeight(1.75);
    assertEquals(1.75, p.getHeight());
  }

  @Test
  public void testSetHeightcm() throws Exception {
    p.setHeight(175);
  }

  @Test
  public void testGetBmi() throws Exception {
    p.setHeight(1.75);
    p.setWeight(73);
    double bmi = p.getBmi();
    assertEquals(23.8, bmi, 0.1);
  }

  @Test
  public void testGetAge() {
    int age = p.getAge();
    assertEquals(20, age);
  }
}