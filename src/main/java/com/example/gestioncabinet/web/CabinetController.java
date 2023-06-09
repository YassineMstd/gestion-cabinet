package com.example.gestioncabinet.web;

import com.example.gestioncabinet.entities.Consultation;
import com.example.gestioncabinet.entities.Medecin;
import com.example.gestioncabinet.entities.Patient;
import com.example.gestioncabinet.service.ICabinetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CabinetController {
    @Autowired
    ICabinetService cabinetService;

    @GetMapping(path = "/index")
    public String home(){
        return "index";
    }

    @GetMapping (path = "/patients")
    public String patients(Model model, @RequestParam(name = "search", defaultValue = "") String search){
        List<Patient> patients = cabinetService.getPatientsByQuery(search);
        model.addAttribute("patients", patients);
        return "patients_list";
    }
    @GetMapping(path = "deletePatient")
    public String deletePatient(@RequestParam(name = "id", defaultValue= "0") Long id){
        cabinetService.deletePatientById(id);
        return "redirect:/patients";
    }
    @GetMapping(path = "/addPatient")
    public String addPatient(Model model){
        Patient p = new Patient();
        model.addAttribute("patient", p);
        return "new_patient";
    }

    @PostMapping(path = "/savePatient")
        public String savePatient(@ModelAttribute Patient patient){
        cabinetService.addPatient(patient);
        return ("redirect:/patients");

    }
    @GetMapping (path = "/medecins")
    public String medecins(Model model, @RequestParam(name = "search", defaultValue = "") String search){
        List<Medecin> medecins = cabinetService.getMedecinsByQuery(search);
        model.addAttribute("medecins", medecins);
        return "medecins_list";
    }
    @GetMapping(path = "deleteMedecin")
    public String deleteMedecin(@RequestParam(name = "id", defaultValue= "0") Long id){
        cabinetService.deleteMedecinById(id);
        return "redirect:/medecins";
    }
    @GetMapping(path = "/addMedecin")
    public String addMedecin(Model model){
        Medecin m = new Medecin();
        model.addAttribute("medecin", m);
        return "new_medecin";
    }

    @PostMapping(path = "/saveMedecin")
    public String saveMedecin(@ModelAttribute Medecin medecin){
        cabinetService.addMedecin(medecin);
        return ("redirect:/medecins");

    }
    @GetMapping (path = "/consultations")
    public String consultations(Model model, @RequestParam(name = "search", defaultValue = "") String search){
        List<Consultation> consultations = cabinetService.getConsultationsByQuery(search);
        model.addAttribute("consultations", consultations);
        return "consultations_list";
    }
    @GetMapping(path = "deleteConsultation")
    public String deleteConsultation(@RequestParam(name = "id", defaultValue= "0") Long id){
        cabinetService.deleteConsultationById(id);
        return "redirect:/consultations";
    }
    @GetMapping(path = "/addConsultation")
    public String addConsultation(Model model){
        Consultation c = new Consultation();
        List<Medecin> m = cabinetService.getAllMedecins();
        List<Patient> p = cabinetService.getAllPatients();
        model.addAttribute("patients", p);
        model.addAttribute("medecins", m);
        model.addAttribute("consultation", c);
        return "new_consultation";
    }

    @PostMapping(path = "/saveConsultation")
    public String saveConsultation(Model model, @ModelAttribute Consultation consultation){
        cabinetService.addConsultation(consultation);
        return ("redirect:/consultations");

    }

}
