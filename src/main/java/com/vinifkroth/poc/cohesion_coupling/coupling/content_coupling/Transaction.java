package com.vinifkroth.poc.cohesion_coupling.coupling.content_coupling;

public class Transaction {

  private boolean transactionFinished;
  private Account debitAccount;
  private Account creditAccount;
  private Double value;

  public Transaction(
      Account debitAccount,
      Account creditAccount, Double value) {
    transactionFinished = false;
    this.debitAccount = debitAccount;
    this.creditAccount = creditAccount;
    this.value = value;
  }

  public boolean isTransactionFinished() {
    return transactionFinished;
  }

  public void setTransactionFinished(boolean transactionFinished) {
    this.transactionFinished = transactionFinished;
  }

  public Account getDebitAccount() {
    return debitAccount;
  }

  public void setDebitAccount(
      Account debitAccount) {
    this.debitAccount = debitAccount;
  }

  public Account getCreditAccount() {
    return creditAccount;
  }

  public void setCreditAccount(
      Account creditAccount) {
    this.creditAccount = creditAccount;
  }

  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }
}
