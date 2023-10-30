package com.upgrad.bookmyconsultation.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class InvalidInputException extends Exception{
    public InvalidInputException(String msg) {
        super(msg);
    }
    private List<String> attributeNames;

}
