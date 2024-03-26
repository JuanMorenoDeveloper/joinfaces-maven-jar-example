package org.joinfaces.example.view;

import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import java.time.LocalDate;


@FacesConverter("dateConverter")
public class DateConverter implements Converter<LocalDate> {

    @Override
    public LocalDate getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s == null) {
            return null;
        }
        return LocalDate.parse(s);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, LocalDate o) {
        if (o == null) {
            return null;
        }
        return o.toString();
    }
}