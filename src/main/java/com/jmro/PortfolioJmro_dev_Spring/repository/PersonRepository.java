package com.jmro.PortfolioJmro_dev_Spring.repository;

import com.jmro.PortfolioJmro_dev_Spring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
