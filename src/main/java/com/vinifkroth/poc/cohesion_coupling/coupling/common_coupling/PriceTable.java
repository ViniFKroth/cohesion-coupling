package com.vinifkroth.poc.cohesion_coupling.coupling.common_coupling;

public class PriceTable {

  //https://deviniciative.wordpress.com/2020/08/03/java-15-introduzindo-sealed-classes/
  //todo To solve this problem, think a way of creating tracing of whom is changing the value
  //All the classes that use this value will be directly affected by its change (that can be done by all system since its a public variable), creating
  // a tight common coupling among them, the best scenario, would be either to transform this value
  // into a protected singleton (changing its value only from inside) or to define as a const
  public static double standardHourPrice = 14.99;


}
