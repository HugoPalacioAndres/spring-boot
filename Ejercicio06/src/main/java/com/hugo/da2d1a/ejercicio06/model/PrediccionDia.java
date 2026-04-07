package com.hugo.da2d1a.ejercicio06.model;

import java.time.LocalDate;

public class PrediccionDia {

    private LocalDate fecha;
    private int probPrecipitacion; // 0–100
    private int tempMin;           // 0–10
    private int tempMax;           // 10–20
    private int uv;                // 0–5
    private String iconoUrl;       // URL de la imagen AEMET

    public PrediccionDia() {
    }

    public PrediccionDia(LocalDate fecha, int probPrecipitacion,
                         int tempMin, int tempMax, int uv, String iconoUrl) {
        this.fecha = fecha;
        this.probPrecipitacion = probPrecipitacion;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.uv = uv;
        this.iconoUrl = iconoUrl;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getProbPrecipitacion() {
        return probPrecipitacion;
    }

    public void setProbPrecipitacion(int probPrecipitacion) {
        this.probPrecipitacion = probPrecipitacion;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }

    public String getIconoUrl() {
        return iconoUrl;
    }

    public void setIconoUrl(String iconoUrl) {
        this.iconoUrl = iconoUrl;
    }
}
