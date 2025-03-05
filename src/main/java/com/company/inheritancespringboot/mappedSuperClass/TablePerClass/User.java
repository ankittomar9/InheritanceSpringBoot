package com.company.inheritancespringboot.mappedSuperClass.TablePerClass;


import jakarta.persistence.*;

import java.util.UUID;

//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@Entity(name="tpc_user")
@MappedSuperclass
public abstract class User {
    @Id
    UUID id;
    String email;
}
