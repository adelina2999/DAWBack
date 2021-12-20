package com.labproiect.demo.view.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity( name = "startere" )
public class StartereView {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO, generator="native" )
    @GenericGenerator( name = "native",strategy = "native" )
    private long id_starter;
    private String name;
    private long price;
    private boolean in_stock;
    private String ingrediente;
    private long greutate;
}