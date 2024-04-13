package br.com.example.documentation.controller;

import br.com.example.documentation.domain.PersonRequest;
import br.com.example.documentation.domain.PersonResponse;
import br.com.example.documentation.exceptions.PersonNotFoundException;
import br.com.example.documentation.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController implements IPersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/person")
    public ResponseEntity<PersonResponse> create(@RequestBody PersonRequest personRequest) {
        return ResponseEntity.ok(personService.create(personRequest));
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<PersonResponse> get(@PathVariable String id) throws PersonNotFoundException {
        return ResponseEntity.ok(personService.get(id));
    }
}
