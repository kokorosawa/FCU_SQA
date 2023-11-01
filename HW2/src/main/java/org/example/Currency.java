package org.example;

public class Currency {
  int amount;
  String symbol;

  public Currency(int amount, String symbol) {
    this.amount = amount;
    this.symbol = symbol;
  }

  public Currency add(Currency currency) {
    if (this.symbol == "NT" && currency.symbol == "US"){
      return new Currency((this.amount + currency.amount * 30) , "NT");
    }else if(this.symbol == "US" && currency.symbol == "NT"){
      return new Currency((this.amount + currency.amount / 30) , "US");
    }
    return new Currency((this.amount + currency.amount) , this.symbol);
  }
  public int getAmount() {
    return this.amount;
  }
}
