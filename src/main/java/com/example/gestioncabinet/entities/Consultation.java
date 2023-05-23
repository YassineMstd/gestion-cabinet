package com.example.gestioncabinet.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity @NoArgsConstructor @AllArgsConstructor @ToString @Data
@Table(name = "CONSULTATIONS")
public class Consultation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dateConsultation;
    private String description;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin;
}
