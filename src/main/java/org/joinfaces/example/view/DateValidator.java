package org.joinfaces.example.view;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;
import java.time.LocalDate;

@FacesValidator("dateValidator")
public class DateValidator implements Validator<LocalDate> {


    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, LocalDate localDate) throws ValidatorException {
        if(localDate.isBefore(LocalDate.now())){
            FacesMessage error = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Error", "La fecha no puede estar en el pasado");
            throw new ValidatorException(error);
        }
    }
}