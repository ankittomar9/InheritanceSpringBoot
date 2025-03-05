package com.company.inheritancespringboot.mappedSuperClass.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name="msc_instructor")
public class Instructor extends User {
    String company;
}

//