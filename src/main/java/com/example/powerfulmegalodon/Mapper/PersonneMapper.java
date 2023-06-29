package com.example.powerfulmegalodon.Mapper;

import com.example.powerfulmegalodon.DTO.PersonneDTO;
import com.example.powerfulmegalodon.Models.Personne;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonneMapper {
    Personne PersonneDTOToPersonneTarget(PersonneDTO source);
    PersonneDTO PersonneToPersonneDTOTarget(Personne source);
}
