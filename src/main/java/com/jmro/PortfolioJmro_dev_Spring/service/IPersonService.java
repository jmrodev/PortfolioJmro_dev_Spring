package com.jmro.PortfolioJmro_dev_Spring.service;

import com.jmro.PortfolioJmro_dev_Spring.model.Person;
import java.util.List;

public interface IPersonService {

    public List<Person> viewPersons();

    public void addPerson(Person per);

    public void deletePerson(Long id);

    public Person findPerson(Long id);

    public void editPerson(Person per);

}
