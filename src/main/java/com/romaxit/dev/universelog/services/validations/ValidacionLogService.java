package com.romaxit.dev.universelog.services.validations;

import com.romaxit.dev.universelog.domain.documents.LogAppDocument;
import com.romaxit.dev.universelog.domain.dtos.LogAppDocumentDto;
import lombok.Getter;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Service
public class ValidacionLogService implements ValidacionService<LogAppDocument> {

    @Getter
    private String mensajesError;

    @Override
    public boolean validar(LogAppDocumentDto documento){
        boolean result = true;
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<LogAppDocumentDto>> violations = validator.validate(documento);
        if (!violations.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (ConstraintViolation<LogAppDocumentDto> violation : violations) {
                sb.append("campo: ").append(violation.getPropertyPath()).append(". Error: ").append(violation.getMessage()).append("; ");
            }
            this.mensajesError = sb.toString();
            result = false;
        }
        return result;
    }
}
