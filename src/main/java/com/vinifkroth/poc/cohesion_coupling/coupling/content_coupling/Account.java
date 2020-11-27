package com.vinifkroth.poc.cohesion_coupling.coupling.content_coupling;

import java.util.ArrayList;
import java.util.List;

public class Account {

  private Double balance;
  private List<Transaction> transactionsInvolved;
  private String owner;

  public Account(Double balance, String owner) {
    this.balance = balance;
    this.owner = owner;
  }

  public Account(String owner) {
    this.owner = owner;
    this.balance = 0D;
    this.transactionsInvolved = new ArrayList<>();
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    if(balance < 0)
      throw new IllegalArgumentException("Balance cannot be less than 0");
    this.balance = balance;
  }

  public List<Transaction> getTransactionsInvolved() {
    return transactionsInvolved;
  }

  public void setTransactionsInvolved(
      List<Transaction> transactionsInvolved) {
    this.transactionsInvolved = transactionsInvolved;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }
}
