package com.digitalhouse.controllers;

import com.digitalhouse.dtos.CertificateDTO;
import com.digitalhouse.dtos.StudentDTO;
import com.digitalhouse.services.CertificateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyzeNotesRestController {
    private final CertificateService certificateService;

    public AnalyzeNotesRestController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @PostMapping("/analyzeNotes")
    public CertificateDTO analyzeNotes(@RequestBody StudentDTO notes){
        return certificateService.analyzeNotes(notes);
    }
}
