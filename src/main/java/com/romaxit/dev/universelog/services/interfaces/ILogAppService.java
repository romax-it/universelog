package com.romaxit.dev.universelog.services.interfaces;

import com.romaxit.dev.universelog.domain.documents.LogAppDocument;
import com.romaxit.dev.universelog.domain.dtos.LogAppDocumentDto;
import config.CustomApplicationException;

import javax.management.BadAttributeValueExpException;
import java.util.List;

public interface ILogAppService {
    List<LogAppDocument> findAllByAppName(String appName);
    List<LogAppDocument> findALl();
    List<LogAppDocument> findAllByClase(String clase);

    void save(LogAppDocumentDto logAppDocument) throws CustomApplicationException;
}
