package org.joinfaces.example.view;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


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