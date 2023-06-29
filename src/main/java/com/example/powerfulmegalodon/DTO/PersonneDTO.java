package com.example.powerfulmegalodon.DTO;

import lombok.Data;

import java.time.LocalDate;
@Data
public class PersonneDTO {
    private Long idPersonne;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
}
