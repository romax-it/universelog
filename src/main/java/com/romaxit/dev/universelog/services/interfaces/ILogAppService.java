package com.romaxit.dev.universelog.services.interfaces;

import com.romaxit.dev.universelog.domain.documents.LogAppDocument;

import java.util.List;

public interface ILogAppService {
    List<LogAppDocument> findAllByAppName(String appName);
    List<LogAppDocument> findALl();
    List<LogAppDocument> findAllByClase(String clase);
}
