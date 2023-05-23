package com.example.gestioncabinet.repos;

import com.example.gestioncabinet.entities.Consultation;
import com.example.gestioncabinet.entities.Medecin;
import com.example.gestioncabinet.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Long> {
    //List<Consultation> findConsultationsByPatient(Patient patient);
    //List<Consultation> findConsultationsByMedecin(Medecin medecin);
}
