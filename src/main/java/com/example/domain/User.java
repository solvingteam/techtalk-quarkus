package com.example.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.ws.rs.GET;

@Entity
@Getter
@Setter
public class User extends PanacheEntity {

    private String username;
    private String password;

}
