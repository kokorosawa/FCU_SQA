package org.example;

public class DayCalculator {
  int year = 2021;
  int month;
  int date;
  int day;
  int monthValue[] = {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

  public DayCalculator(int month, int date) {
    if(month < 1 || month > 12) {
      throw new IllegalArgumentException("月份不可小於1或大於12");
    }
    this.month = month;
    if(date < 1 || date > 31) {
      throw new IllegalArgumentException("日期不可小於1或大於31");
    }
    this.date = date;
  }

  public int getDayOfWeek() {
    int yearvalue = this.year - 2000;
    int over4num = 5;
    int centuryvalue = 0;
    int temp = (yearvalue + over4num + centuryvalue) % 7;

    this.day = (this.date + this.monthValue[this.month - 1] + temp) % 7;
    return this.day;
  }
}
