package com.jmro.PortfolioJmro_dev_Spring.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    //add validation @Size(min = 1, max = 50, message = "Se requiere ingresar datos de al menos un caracter")
    private String name;
    @NotNull
    //add validation @Size(min = 1, max = 50, message = "Se requiere ingresar datos de al menos un caracter")
    private String lastname;
    @NotNull
    //add validation @Size(min = 1, max = 50, message = "Se requiere ingresar datos de al menos un caracter")
    private String age;
    @NotNull
    //add validation @Size(min = 1, max = 50, message = "Se requiere ingresar datos de al menos un caracter")
    private String nameschool;
    @NotNull
    //add validation @Size(min = 1, max = 50, message = "Se requiere ingresar datos de al menos un caracter")
    private String yearschool;

    public Person(Long id, String name, String lastname, String age, String nameschool, String yearschool) {
        this.id = id;
        
        
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.nameschool = nameschool;
        this.yearschool = yearschool;
    }
    
    
    public Person() {
    }



   


}
