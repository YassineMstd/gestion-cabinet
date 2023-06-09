package com.example.gestioncabinet.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity @NoArgsConstructor @AllArgsConstructor @ToString @Data
@Table(name = "CONSULTATIONS")
public class Consultation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dateConsultation;
    private String description;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin;
}
