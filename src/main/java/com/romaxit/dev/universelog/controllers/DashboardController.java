package com.romaxit.dev.universelog.controllers;

import com.romaxit.dev.universelog.domain.documents.LogAppDocument;
import com.romaxit.dev.universelog.domain.dtos.LogAppDocumentDto;
import com.romaxit.dev.universelog.domain.dtos.ParametrosDto;
import com.romaxit.dev.universelog.services.interfaces.ILogAppService;
import config.CustomApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.BadAttributeValueExpException;
import java.util.List;

@RestController
@RequestMapping("dashboard")
public class DashboardController {

    @Autowired
    ILogAppService service;

    @GetMapping("find-all-appname")
    public List<LogAppDocument> findByAppName(@RequestBody ParametrosDto param) {
        return service.findAllByAppName(param.getAppName());
    }

    @GetMapping("find-all-clase")
    public List<LogAppDocument> findAllByClase(@RequestBody ParametrosDto param) {
        return service.findAllByClase(param.getClase());
    }

    @GetMapping("find-all")
    public List<LogAppDocument> findAll() {
        return service.findALl();
    }

    @PostMapping ("add")
    public ResponseEntity<Object> save(@RequestBody LogAppDocumentDto logAppDocument) throws CustomApplicationException {
        service.save(logAppDocument);
        return new ResponseEntity<>( null, HttpStatus.OK);

    }

}
