package com.digitalhouse.demo.unit;

import com.digitalhouse.dtos.CertificateDTO;
import com.digitalhouse.dtos.StudentDTO;
import com.digitalhouse.dtos.SubjectDTO;
import com.digitalhouse.services.impl.CertificateServiceImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CertificateServiceImplTest {

	CertificateServiceImpl certificateService = new CertificateServiceImpl();

	static StudentDTO studentDTO;

	@BeforeAll
	static void initSubjects() {
		List<SubjectDTO> subjects = new ArrayList<>();
		subjects.add(new SubjectDTO("Banco de dados", 8));
		subjects.add(new SubjectDTO("Estrutura de dados", 7));
		subjects.add(new SubjectDTO("Matemática aplicada", 6));

		studentDTO = new StudentDTO("Stephanie", subjects);
	}

	@Test
	void testAnalyzeNotesAverageAssertEquals() {

		CertificateDTO certificateDTO = certificateService.analyzeNotes(studentDTO);

		double average = certificateDTO.getAverage();

		assertEquals(7.0, average);
	}

	@Test
	void testAnalyzeNotesAverageAssertNotEquals() {

		CertificateDTO certificateDTO = certificateService.analyzeNotes(studentDTO);

		double average = certificateDTO.getAverage();

		assertNotEquals(6.0, average);
	}

	@Test
	void testAnalyzeNotesWriteDiplomaAssertEquals() {

		CertificateDTO certificateDTO = certificateService.analyzeNotes(studentDTO);

		double average = certificateDTO.getAverage();
		String message = certificateDTO.getMessage();

		assertEquals("Stephanie usted ha conseguido el promedio de 7.0", message);
	}

	@Test
	void testAnalyzeNotesWriteDiplomaAssertNotEquals() {

		CertificateDTO certificateDTO = certificateService.analyzeNotes(studentDTO);

		double average = certificateDTO.getAverage();
		String message = certificateDTO.getMessage();

		assertNotEquals(" usted ha conseguido el promedio de 7.0", message);
	}

	@Test
	void testAnalyzeNotesWithHonorsAssertEquals() {

		CertificateDTO certificateDTO = certificateService.analyzeNotes(studentDTO);

		double average = certificateDTO.getAverage();
		String message = certificateDTO.getMessage();

		assertEquals("Stephanie usted ha conseguido el promedio de 7.0", message);
	}

	@Test
	void testAnalyzeNotesWithHonorsAssertNotEquals() {

		CertificateDTO certificateDTO = certificateService.analyzeNotes(studentDTO);

		double average = certificateDTO.getAverage();
		String message = certificateDTO.getMessage();

		assertNotEquals("¡Felicitaciones Stephanie! Usted tiene el gran promedio de 7.0", message);
	}
}
