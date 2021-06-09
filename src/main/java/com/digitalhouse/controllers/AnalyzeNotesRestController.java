package com.digitalhouse.controllers;

import com.digitalhouse.Exceptions.ApiExceptionControllerAdvice;
import com.digitalhouse.dtos.CertificateDTO;
import com.digitalhouse.dtos.StudentDTO;
import com.digitalhouse.services.CertificateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.validation.Valid;
import java.awt.*;

@RestController
public class AnalyzeNotesRestController {
    private final CertificateService certificateService;

    public AnalyzeNotesRestController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @PostMapping(value = "/analyzeNotes", consumes = {MediaType.ALL_VALUE})
    public ResponseEntity<CertificateDTO> analyzeNotes(@RequestBody @Valid StudentDTO notes){
        try {
            return new ResponseEntity<>(certificateService.analyzeNotes(notes), HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
