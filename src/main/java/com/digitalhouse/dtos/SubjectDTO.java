package com.digitalhouse.dtos;

import org.hibernate.validator.constraints.Range;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;

@Validated
public class SubjectDTO {

    @NotNull(message = "Nome obrigatorio")
    @Size(min = 8, max = 50)
    @Pattern(regexp = "^[a-zA-Z ]*$", message = "Caracteres permitidos a-z ")
    private String subject;

    @NotNull(message = "note nao pode ser null")
    @Range(min = 0, max = 10, message = "A nota dever estar entre 0 e 10")
    private Integer note;

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

