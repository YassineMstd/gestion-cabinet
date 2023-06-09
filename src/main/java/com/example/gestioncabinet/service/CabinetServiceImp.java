package com.example.gestioncabinet.service;

import com.example.gestioncabinet.entities.Consultation;
import com.example.gestioncabinet.entities.Medecin;
import com.example.gestioncabinet.entities.Patient;
import com.example.gestioncabinet.repos.ConsultationRepository;
import com.example.gestioncabinet.repos.MedecinRepository;
import com.example.gestioncabinet.repos.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service @Transactional @AllArgsConstructor
public class CabinetServiceImp implements ICabinetService {
    @Autowired
    PatientRepository patientRepository;
    @Autowired
    MedecinRepository medecinRepository;
    @Autowired
    ConsultationRepository consultationRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public List<Patient> getPatientsByQuery(String q) {
        return patientRepository.findPatientsByNomContainsOrPrenomContains(q,q);
    }

    @Override
    public void addPatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }

    @Override
    public List<Consultation> getConsultationsByPatient(Patient patient) {
        return null; //consultationRepository.findConsultationsByPatient(patient);
    }

    @Override
    public void addMedecin(Medecin medecin) {
        medecinRepository.save(medecin);
    }

    @Override
    public List<Medecin> getAllMedecins() {
        return medecinRepository.findAll();
    }
    @Override
    public List<Medecin> getMedecinsByQuery(String q) {
        return medecinRepository.findMedecinsByNomContainsOrPrenomContains(q,q);
    }

    @Override
    public void deleteMedecinById(Long id) {
        medecinRepository.deleteById(id);
    }

    @Override
    public List<Consultation> getConsultationsByMedecin(Medecin medecin) {
        return null; //consultationRepository.findConsultationsByMedecin(medecin);
    }

    @Override
    public void addConsultation(Consultation consultation) {
        consultationRepository.save(consultation);
    }

    @Override
    public List<Consultation> getAllConsultations() {
        return consultationRepository.findAll();
    }

    @Override
    public List<Consultation> getConsultationsByQuery(String q){
        return consultationRepository.findConsultationsByMedecinNomContainsOrPatientNomContains(q,q);
    }

    @Override
    public void deleteConsultationById(Long id) {
        consultationRepository.deleteById(id);
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public Medecin getMedecinById(Long id) {
        return medecinRepository.findById(id).get();
    }

    @Override
    public Consultation getConsultationById(Long id) {
        return consultationRepository.findById(id).get();
    }
}
