package org.example;

public class Tomorrow {
  int year;
  int month;
  int date;


  public Tomorrow(int year, int month, int date) {
    this.year = year;
    this.month = month;
    this.date = date;
  }

  public String getTomorrow() {
    if (this.month == 2) {
      if (this.date == 28) {
        this.date = 1;
        this.month = 3;
      } else {
        this.date += 1;
      }
    } else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
      if (this.date == 30) {
        this.date = 1;
        this.month += 1;
      } else {
        this.date += 1;
      }
    } else {
      if (this.date == 31) {
        this.date = 1;
        this.month += 1;
      } else {
        this.date += 1;
      }
    }
    return String.format("%02d", this.year) + "-" + String.format("%02d", this.month) + "-" + String.format("%02d", this.date);
  }
}
