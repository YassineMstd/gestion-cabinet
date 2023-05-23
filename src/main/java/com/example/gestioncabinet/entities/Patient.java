package com.example.gestioncabinet.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Collection;
import java.util.Date;
@Entity @NoArgsConstructor @AllArgsConstructor @Data @ToString
@Table(name = "PATIENTS")
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    @Column(length = 100)
    private String prenom;
    private String cin;
    private String tel;
    private String email;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    @OneToMany(mappedBy = "patient")
    private Collection<Consultation> consultations;
}
