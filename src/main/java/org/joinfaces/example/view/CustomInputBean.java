package org.joinfaces.example.view;

import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.time.LocalDate;

@ViewScoped
@Component // No se requiere si no se usa Spring
public class CustomInputBean implements Serializable {
    private LocalDate fecha;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
