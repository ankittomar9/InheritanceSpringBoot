package com.company.inheritancespringboot.mappedSuperClass.TablePerClass;
import jakarta.persistence.Entity;

@Entity(name="msc_mentor")
public class Mentor extends User {
    Double ratings;
}