package com.example.gestioncabinet.repos;

import com.example.gestioncabinet.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {

}
