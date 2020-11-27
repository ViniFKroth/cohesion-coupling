package com.vinifkroth.poc.cohesion_coupling.coupling.common_coupling;

public class Painting implements Job {

  @Override
  public double jobPricing(double hoursSpent) {
    return PriceTable.standardHourPrice * hoursSpent * 1.2 + 25.99;
  }
}
