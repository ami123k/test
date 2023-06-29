package com.example.powerfulmegalodon.Service;

import com.example.powerfulmegalodon.DTO.PersonneDTO;

import java.util.List;

public interface PersonneService {
    PersonneDTO save(PersonneDTO personneDTO);

    List<PersonneDTO> Affichage();
}
