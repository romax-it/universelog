package com.romaxit.dev.universelog.domain.documents;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "log_apps")
@Getter
@Setter
public class LogAppDocument implements Serializable {

    private static final long serialVersionUID = -7788619177798333712L;

    @Id
    private String id;

    @NotNull
    @Field("app-name")
    private String appName;

    @NotNull
    private String tipo;

    @NotNull
    private String mensaje;

    @NotNull
    private Date fecha;

    private int codigo;

    @NotNull
    private String clase;

    private String metodo;

    private String negocio;

    @Field("tag-rastreo")
    private String tagRastreo;

    private String flujo;

    private String parametros;

    @Field("otros-parametros")
    private String otrosParametros;

    private String excepcion;
}