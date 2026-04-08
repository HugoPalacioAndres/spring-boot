package com.hugo.da2d1a.ejercicio6j;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrediccionDia {
    private LocalDate fecha;
    private int probabilidadPrecipitacion;
    private int tempMin;
    private int tempMax;
    private int nivelUV;

    public String getUrlImagen() {
        if (probabilidadPrecipitacion < 25) return "https://www.aemet.es/imagenes/png/estado_cielo/11_g.png";
        if (probabilidadPrecipitacion < 50) return "https://www.aemet.es/imagenes/png/estado_cielo/12_g.png";
        if (probabilidadPrecipitacion < 75) return "https://www.aemet.es/imagenes/png/estado_cielo/14_g.png";
        return "https://www.aemet.es/imagenes/png/estado_cielo/25_g.png";
    }

}
