package com.example.gestioncabinet;

import com.example.gestioncabinet.entities.Consultation;
import com.example.gestioncabinet.entities.Medecin;
import com.example.gestioncabinet.entities.Patient;
import com.example.gestioncabinet.repos.PatientRepository;
import com.example.gestioncabinet.service.ICabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class GestionCabinetApplication implements CommandLineRunner {
    @Autowired
    private ICabinetService cabinetService;
    public static void main(String[] args) {

        SpringApplication.run(GestionCabinetApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

       /*Patient p1 = new Patient(null, "Marzak", "Mohammed", "CB12345", "0612345678", "m_mohammed@gmail.com",new Date(), null);
       cabinetService.addPatient(p1);
        Patient p2 = new Patient(null, "Haimoud", "Bouazza", "CB54321", "0687654321", "h_bouazza@gmail.com",new Date(), null);
        cabinetService.addPatient(p2);
        Patient p3 = new Patient(null, "Samiri", "Karim", "CB12891", "0661234567", "s_karim@gmail.com",new Date(), null);
        cabinetService.addPatient(p3);

       Medecin m1 = new Medecin(null, "Moumtaz", "Salah", "m_Salah@gmail.com", "0606060606",null);
       Medecin m2 = new Medecin(null, "Labyad", "Ahmed", "l_ahmed@gmail.com", "0611111112", null);
       cabinetService.addMedecin(m1);
       cabinetService.addMedecin(m2);

       Patient p = cabinetService.getPatientById(1L);
       Medecin m = cabinetService.getMedecinById(2L);

        Consultation c1 = new Consultation(null, new Date(), "Exemple description Consultation 1", p, m);
        cabinetService.addConsultation(c1);

       Consultation c = cabinetService.getConsultationById(1L);
       System.out.println(c.getDescription() + " - " + c.getMedecin().getNom() + " - " + c.getPatient().getNom());*/

    }
}
