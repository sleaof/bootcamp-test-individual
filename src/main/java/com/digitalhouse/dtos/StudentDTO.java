package com.digitalhouse.dtos;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Validated
public class StudentDTO {
    @NotNull(message = "Name cannot be null")
    @Size(min = 8, max = 50, message
            = "Name must be between 8 and 50 characters")
    @Pattern(regexp="^[a-z ]*$", message = "Invalid name")
    private String name;

    @Valid
    private List<SubjectDTO> subjects;

    public StudentDTO() {
    }

    public StudentDTO(String name, List<SubjectDTO> subjects) {
        this.name = name;
        this.subjects = subjects;
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
