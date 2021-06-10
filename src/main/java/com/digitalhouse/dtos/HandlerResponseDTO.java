package com.digitalhouse.dtos;

import java.util.Date;

public class HandlerResponseDTO {

    private String message;
    private String status;
    private Date timestamp;

    public HandlerResponseDTO() {
    }

    public HandlerResponseDTO(String message, String status, Date timestamp) {
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
