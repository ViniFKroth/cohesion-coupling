package com.vinifkroth.poc.cohesion_coupling.coupling.common_coupling;

public class Cleaning implements Job {

  @Override
  public double jobPricing(double hoursSpent) {
    return PriceTable.standardHourPrice * hoursSpent + 20.99;
  }
}
