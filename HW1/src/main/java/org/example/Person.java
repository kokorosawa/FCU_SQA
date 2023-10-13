package org.example;

import static java.lang.Math.pow;
/**
 * This is Person class.
 * */

public class Person {
  private String name;
  private int birthYear;
  private double height;
  private double weight;
  private double bmi;
  private double age;
  /**
   * This is Person constructor.
   * */

  public Person(String name, int birthYear) throws Exception {
    this.name = name;

    if (birthYear <= 0) {
      throw new Exception("出生年不可小於0");
    }
    this.birthYear = birthYear;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBirthYear() {
    return birthYear;
  }
  /**
   * This is setBirthYear function.
   * */

  public void setBirthYear(int birthYear) throws Exception {
    if (birthYear <= 0) {
      throw new Exception("出生年不可小於0");
    }
    this.birthYear = birthYear;
  }

  public double getHeight() {
    return height;
  }
  /**
   * This is setHeight function.
   * */

  public void setHeight(double height) throws Exception {
    if (height <= 0) {
      throw new Exception("身高不可為零或負");
    }
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }
  /**
   * This is setWeight function.
   * */

  public void setWeight(double weight) throws Exception {
    if (weight <= 0) {
      throw new Exception("體重不可為零或負");
    }
    this.weight = weight;
  }
  /**
   * This is getBmi function.
   * */

  public double getBmi() {
    this.bmi = this.weight / pow(this.height, 2);
    System.out.println("Bmi:" + this.bmi);
    return this.bmi;
  }
  /**
   * This is getAge function.
   * */

  public double getAge() {
    int thisYear = 2023;
    this.age = thisYear - this.birthYear;
    System.out.println("age:" + this.age);
    return this.age;
  }
}
