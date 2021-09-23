package com.romaxit.dev.universelog.controllers;

import com.romaxit.dev.universelog.domain.documents.LogAppDocument;
import com.romaxit.dev.universelog.domain.dtos.ParametrosDto;
import com.romaxit.dev.universelog.services.interfaces.ILogAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
