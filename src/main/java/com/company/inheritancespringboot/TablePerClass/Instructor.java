package com.company.inheritancespringboot.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name="tpc_instructor")
public class Instructor extends User {
    String company;
}

//