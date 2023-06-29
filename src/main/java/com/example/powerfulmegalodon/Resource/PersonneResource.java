package com.example.powerfulmegalodon.Resource;

import com.example.powerfulmegalodon.DTO.PersonneDTO;
import com.example.powerfulmegalodon.Models.Personne;
import com.example.powerfulmegalodon.Service.PersonneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/person")
@Api(value = "TEST")
@RequiredArgsConstructor
public class PersonneResource {
    private final PersonneService service;

    @ApiOperation(value = "Create a person")
    @PostMapping()
    public PersonneDTO create(@RequestBody PersonneDTO personneDTO){

        try {
            PersonneDTO result = service.save(personneDTO);
            return result;
        } catch (DuplicateKeyException e) {
            throw new IllegalArgumentException("duplicate key");
        }
    }
    @ApiOperation(value = "get all Persons")
    @GetMapping()
    public List<PersonneDTO> getAllPaymentchoices() {
        return service.Affichage();
    }
}
