package org.example;

public class Bmi {
  double height;
  double weight;
  double bmi;
  public Bmi(double height, double weight) {
    if (height <= 0) {
      throw new IllegalArgumentException("身高不可為零或負");
    } else if (height > 3){
      throw new IllegalArgumentException("身高單位為公尺");
    }
    this.height = height;
    if(weight <= 0) {
      throw new IllegalArgumentException("體重不可為零或負");
    }
    this.weight = weight;

    this.bmi = weight / Math.pow(height, 2);
  }

  public double getBmi() {
    return this.bmi;
  }
}