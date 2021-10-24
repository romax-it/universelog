package com.romaxit.dev.universelog.services.validations;

import com.romaxit.dev.universelog.domain.dtos.LogAppDocumentDto;

public interface ValidacionService<T> {
    boolean validar(LogAppDocumentDto documento);
}
