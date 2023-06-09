package com.example.gestioncabinet.service;

import com.example.gestioncabinet.entities.Consultation;
import com.example.gestioncabinet.entities.Medecin;
import com.example.gestioncabinet.entities.Patient;

import java.util.List;

public interface ICabinetService {

    //Service Patient
    List<Patient> getAllPatients();
    List<Patient> getPatientsByQuery(String q);
    void addPatient(Patient patient);
    void deletePatientById(Long id);
    List<Consultation> getConsultationsByPatient(Patient patient);

    //Service Medecin
    void addMedecin(Medecin medecin);
    List<Medecin> getAllMedecins();
    List<Medecin> getMedecinsByQuery(String q);
    void deleteMedecinById(Long id);
    List<Consultation> getConsultationsByMedecin(Medecin medecin);

    //Service Consultation
    void addConsultation (Consultation consultation);
    List<Consultation> getAllConsultations();
    void deleteConsultationById(Long id);
    List<Consultation> getConsultationsByQuery(String q);
    Patient getPatientById(Long id);
    Medecin getMedecinById(Long id);
    Consultation getConsultationById(Long id);
}
