package com.vinifkroth.poc.cohesion_coupling.coupling.stamp_coupling;

import java.util.ArrayList;

public class PersonRegister {

  private static final ArrayList<Person> personRegistry = new ArrayList<>();


  /*
   * Right here, the personRegister class is stamp coupled to the personRegistry class,
   * unnecessarily, having an anemic object being passed as parameter may result in problems, hence
   * the configuration of this object can change, influencing directly on the registerPerson method,
   * without the class having the proper control. One way for this to be changed, is to pass the params
   * individually to the class, allowing the class to build the object, this way if any changes occur,
   * it will be easier for the class to control, due to the change on its parameters. Its important to,
   * mention, that this change, may sometimes create data coupling.
   * */
  public static boolean registerPerson(Person person) {
    if (person.getCpf() == null || person.getName() == null || person.getAddress() == null) {
      throw new IllegalArgumentException("All the person's information must be filled.");
    }

    if (person.getName().length() < 1) {
      throw new IllegalArgumentException("Name must have more than 1 letter.");
    }

    if (person.getCpf().length() != 11) {
      throw new IllegalArgumentException("Cpf is invalid");
    }
    return personRegistry.add(person);
  }

}
