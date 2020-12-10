package com.vinifkroth.poc.cohesion_coupling.coupling.content_coupling;

public class TransactionManager {

  //Why's this bad? TransactionManager is tightly coupled with Account and Transaction,
  // because the class directly alters the state of the variables from the other classes
  // (even if that's made through getters and setters), the ideal scenario for this application,
  // would be if the classes Account and Transaction, would expose methods that effectively
  // made those changes inside the class, without leaking its variable's states to another classes.
  // For instance: an idea would be if the transaction class had an makeTransaction method,
  // that would call a method increaseBalance/DecreaseBalance (or changeBalance) inside Account, that way,
  // the changes on the variable states, would only occur inside the owner class
  public void makeTransaction(Transaction transaction) {
    Account debitAccount = transaction.getDebitAccount();
    debitAccount.setBalance(debitAccount.getBalance() - transaction.getValue());

    Account creditAccount = transaction.getCreditAccount();
    creditAccount.setBalance(creditAccount.getBalance() + transaction.getValue());

    debitAccount.getTransactionsInvolved().add(transaction);
    creditAccount.getTransactionsInvolved().add(transaction);

    transaction.setTransactionFinished(true);
  }
}
