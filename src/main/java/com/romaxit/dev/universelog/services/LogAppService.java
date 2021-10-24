package com.romaxit.dev.universelog.services;

import com.romaxit.dev.universelog.domain.documents.LogAppDocument;
import com.romaxit.dev.universelog.domain.repositories.LogAppRepository;
import com.romaxit.dev.universelog.services.interfaces.ILogAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogAppService implements ILogAppService {

    @Autowired
    LogAppRepository repository;

    @Override
    public List<LogAppDocument> findAllByAppName(String appName) {
        return repository.findAllByAppContaining(appName);
    }

    @Override
    public List<LogAppDocument> findALl() {
        return repository.findAll();
    }

    @Override
    public List<LogAppDocument> findAllByClase(String clase) {
        return repository.findAllByClase(clase);
    }
}
