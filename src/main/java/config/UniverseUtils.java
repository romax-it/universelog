package config;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UniverseUtils {

    public static String obtenerCadenaFechaActual() {
        String formatoSalida = UniverseUtils.Formatos.FORMATO_FECHA_HORA_CLIENTE;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formatoSalida);
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public static class Formatos{
        private Formatos() {
            // Inicializacion Sonar
        }
        public static final String FORMATO_FECHA_HORA_CLIENTE  = "dd/MM/yyyy HH:mm:ss";
    }

}
