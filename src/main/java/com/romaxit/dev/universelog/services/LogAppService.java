package com.romaxit.dev.universelog.services;

import com.romaxit.dev.universelog.domain.documents.LogAppDocument;
import com.romaxit.dev.universelog.domain.dtos.LogAppDocumentDto;
import com.romaxit.dev.universelog.domain.repositories.LogAppRepository;
import com.romaxit.dev.universelog.services.interfaces.ILogAppService;
import com.romaxit.dev.universelog.services.validations.ValidacionLogService;
import config.CustomApplicationException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.management.BadAttributeValueExpException;
import java.util.List;

@Service
public class LogAppService implements ILogAppService {

    final
    LogAppRepository repository;

    final ValidacionLogService validacionLogService;

    @Autowired
    public LogAppService(LogAppRepository repository, ValidacionLogService validacionLogService) {
        this.repository = repository;
        this.validacionLogService = validacionLogService;
    }


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

    @Override
    public void save(LogAppDocumentDto logAppDocumentDto) throws  CustomApplicationException {
        if ( validacionLogService.validar(logAppDocumentDto)){
            ModelMapper mapper = new ModelMapper();
            LogAppDocument logAppDocument = mapper.map(logAppDocumentDto, LogAppDocument.class);
            repository.save(logAppDocument);
        }else{
            throw new CustomApplicationException(HttpStatus.BAD_REQUEST, validacionLogService.getMensajesError()) ;
        }

    }
}
