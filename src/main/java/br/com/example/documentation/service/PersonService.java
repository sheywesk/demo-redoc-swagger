package br.com.example.documentation.service;

import br.com.example.documentation.domain.PersonRequest;
import br.com.example.documentation.domain.PersonResponse;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public PersonResponse get(String id) {
        return new PersonResponse(id, "sheywesk");
    }

    public PersonResponse create(PersonRequest personRequest) {
        return new PersonResponse("123", personRequest.name());
    }
}
