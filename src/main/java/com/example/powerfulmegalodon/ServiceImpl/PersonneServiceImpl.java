package com.example.powerfulmegalodon.ServiceImpl;

import com.example.powerfulmegalodon.DTO.PersonneDTO;
import com.example.powerfulmegalodon.Mapper.PersonneMapper;
import com.example.powerfulmegalodon.Models.Personne;
import com.example.powerfulmegalodon.Repository.PersonneRepository;
import com.example.powerfulmegalodon.Service.PersonneService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class PersonneServiceImpl implements PersonneService {

    private final PersonneRepository repository;
    private final PersonneMapper mapper;

    public PersonneServiceImpl(PersonneRepository repository, PersonneMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

@Override
    public PersonneDTO save(PersonneDTO personneDTO) {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(personneDTO.getDateNaissance(), currentDate).getYears();
if (age<150){
        PersonneDTO result = Optional.of(personneDTO)
                .map(mapper::PersonneDTOToPersonneTarget)
                .map(repository::save).map(mapper::PersonneToPersonneDTOTarget).orElse(null);
        return result;
    }
else {
    throw new IllegalArgumentException("Invalid age. Age cannot be greater than 150.");
}
    }
    @Override
    public List<PersonneDTO>Affichage(){
        return repository.findAll().stream()
                .sorted(Comparator.comparing(Personne::getNom))
                .map(mapper::PersonneToPersonneDTOTarget)
                .collect(Collectors.toList());
    }
}
