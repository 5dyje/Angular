package com.Projet.Projet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="ROLE")
public class Role {

    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "NOM")
    private String nom;

}
