package com.company.inheritancespringboot.mappedSuperClass.TablePerClass;

import jakarta.persistence.Entity;

@Entity(name="msc_ta")
public class Ta extends User {
    int helpRequests;
}