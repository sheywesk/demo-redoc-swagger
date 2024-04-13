package br.com.example.documentation.controller;

import br.com.example.documentation.domain.PersonRequest;
import br.com.example.documentation.domain.PersonResponse;
import br.com.example.documentation.exceptions.PersonNotFoundException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;

public interface IPersonController {
    @Operation(summary = "Create person")
    ResponseEntity<PersonResponse> create(PersonRequest personRequest);

    @Operation(summary = "Return person")
    @ApiResponse(responseCode = "404", content = @Content(schema = @Schema(implementation = PersonNotFoundException.class)))
    @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(implementation = PersonResponse.class)))
    ResponseEntity<PersonResponse> get(String id) throws PersonNotFoundException;

}
