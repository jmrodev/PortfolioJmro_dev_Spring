package com.jmro.PortfolioJmro_dev_Spring.controller;

import com.jmro.PortfolioJmro_dev_Spring.model.Person;
import com.jmro.PortfolioJmro_dev_Spring.service.IPersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private IPersonService persoServ;

    @PostMapping("/new/person")
    public void addPerson(@RequestBody Person pers) {
        persoServ.addPerson(pers);
    }

    @GetMapping("/view/persons")
    @ResponseBody
    public List<Person> viewPersons() {
        return persoServ.viewPersons();
    }

    @DeleteMapping("/delete/{id}")
    public void deletePerson(@PathVariable Long id) {
        persoServ.deletePerson(id);

    }

    @PostMapping("/edit/{id}")
    public void editPerson(@PathVariable Person pers) {
        persoServ.editPerson(pers);
    }

}
