package com.vinifkroth.poc.cohesion_coupling.coupling.stamp_coupling;

public class Person {

  private String name;
  private String cpf;
  private String address;

  public Person(String name, String cpf, String address) {
    this.name = name;
    this.cpf = cpf;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }
}
