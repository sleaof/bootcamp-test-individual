package com.digitalhouse.dtos;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;



public class StudentDTO {

    @NotNull
    @Size(min = 8, max = 50)
    @Pattern(regexp = "^[a-zA-Z ]*$", message = "Caracteres permitidos a-z")
    private String name;
    private List<SubjectDTO> subjects;

    public StudentDTO() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectDTO> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectDTO> subjects) {
        this.subjects = subjects;
    }

}

