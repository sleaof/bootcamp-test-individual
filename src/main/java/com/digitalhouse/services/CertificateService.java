package com.digitalhouse.services;

import com.digitalhouse.dtos.CertificateDTO;
import com.digitalhouse.dtos.StudentDTO;

public interface CertificateService {
    CertificateDTO analyzeNotes(StudentDTO house);
}
