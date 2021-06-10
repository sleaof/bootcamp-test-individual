package com.digitalhouse.dtos;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

@Validated
public class SubjectDTO {
    @NotNull(message = "Name cannot be null")
    @Size(min = 8, max = 50, message
            = "Name must be between 8 and 50 characters")
    @Pattern(regexp="^[a-z ]*$", message = "Invalid name")
    private String subject;

    @NotNull(message = "Note cannot be null")
    @Min(value = 0, message = "Note should not be less than 0")
    @Max(value = 10, message = "Note should not be greater than 10")
    @Size(min = 1, max = 2, message
            = "Note must be between 1 and 2 characters")
    private Integer note;

    public SubjectDTO(String subject, Integer note) {
        this.subject = subject;
        this.note = note;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }
}
