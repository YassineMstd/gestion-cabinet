package com.example.gestioncabinet.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collection;
import java.util.List;

@Entity @NoArgsConstructor @AllArgsConstructor @Data @ToString
@Table(name = "MEDECINS")
public class Medecin {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String tel;
    @OneToMany(mappedBy = "medecin")
    private Collection<Consultation> consultations;
}
