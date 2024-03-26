package org.joinfaces.example.view;

import jakarta.faces.view.ViewScoped;
import lombok.extern.slf4j.Slf4j;
import org.primefaces.PrimeFaces;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDate;

@ViewScoped
@Component // No se requiere si no se usa Spring
@Slf4j
public class CustomInputBean implements Serializable {
    private LocalDate fecha;
    private int count = 0;

    public void execute() {
        log.info("I'm in the backend");
        fecha = LocalDate.now();
        PrimeFaces.current().ajax().addCallbackParam("serverTime", System.currentTimeMillis());
    }

    public void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
