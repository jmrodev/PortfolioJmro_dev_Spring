package com.jmro.PortfolioJmro_dev_Spring.service;

import com.jmro.PortfolioJmro_dev_Spring.model.Person;
import com.jmro.PortfolioJmro_dev_Spring.repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService {

    @Autowired
    public PersonRepository persoRepo;

    @Override
    public List<Person> viewPersons() {
        return persoRepo.findAll();
    }

    @Override
    public void addPerson(Person per) {
        persoRepo.save(per);
    }

    @Override
    public void deletePerson(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Person findPerson(Long id) {
        return persoRepo.findById(id).orElse(null);
    }

    @Override
    public void editPerson(Person per) {
        persoRepo.save(per);

    }

}
