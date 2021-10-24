package com.romaxit.dev.universelog.domain.repositories;

import com.romaxit.dev.universelog.domain.documents.LogAppDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LogAppRepository extends MongoRepository<LogAppDocument, String> {
    List<LogAppDocument> findAllByAppContaining(String appName);
    List<LogAppDocument> findAll();
    List<LogAppDocument> findAllByClase(String clase);
}
