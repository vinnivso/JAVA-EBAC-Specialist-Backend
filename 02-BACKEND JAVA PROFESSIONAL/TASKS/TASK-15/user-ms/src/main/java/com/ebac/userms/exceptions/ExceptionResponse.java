package com.ebac.userms.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class ExceptionResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String message;

    private Date timestamp;

    private String details;

    public ExceptionResponse(String message, Date timestamp, String details){
        super();
        this.message = message;
        this.timestamp = timestamp;
        this.details = details;
    }

}
