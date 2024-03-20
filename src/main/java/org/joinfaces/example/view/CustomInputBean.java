package org.joinfaces.example.view;

import lombok.extern.slf4j.Slf4j;
import org.primefaces.PrimeFaces;
import org.springframework.stereotype.Component;

import javax.enterprise.context.RequestScoped;
import java.io.Serializable;
import java.time.LocalDate;

@RequestScoped
@Component // No se requiere si no se usa Spring
@Slf4j
public class CustomInputBean implements Serializable {
    private LocalDate fecha;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void execute() {
        log.info("I'm in the backend");
        fecha = LocalDate.now();
        PrimeFaces.current().ajax().addCallbackParam("serverTime", System.currentTimeMillis());
    }
}
