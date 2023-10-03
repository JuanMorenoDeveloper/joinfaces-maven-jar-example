package org.joinfaces.example.view;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
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