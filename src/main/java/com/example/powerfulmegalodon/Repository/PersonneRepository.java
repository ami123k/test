package com.example.powerfulmegalodon.Repository;

import com.example.powerfulmegalodon.Models.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface PersonneRepository  extends JpaRepository<Personne, Long> {
}
