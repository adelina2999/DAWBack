package com.labproiect.demo.view.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity( name = "user" )
public class UserView {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO, generator="native" )
    @GenericGenerator( name = "native",strategy = "native" )
    private long id;
    private String login;
    private String password;
}