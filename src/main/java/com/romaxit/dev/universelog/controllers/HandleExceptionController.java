package com.romaxit.dev.universelog.controllers;

import config.CustomApplicationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class HandleExceptionController {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handler(CustomApplicationException e){
        Map<String, String> errorResponse=new HashMap<>();
        errorResponse.put("message",e.getMessage());
        errorResponse.put("status", e.getHttpStatus().value() + "");
        return new ResponseEntity<>(errorResponse,e.getHttpStatus());
    }
}
