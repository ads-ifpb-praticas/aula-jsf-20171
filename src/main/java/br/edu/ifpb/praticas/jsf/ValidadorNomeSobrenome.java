package br.edu.ifpb.praticas.jsf;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 * Created by diogomoreira on 13/09/17.
 */
@FacesValidator("validadorNomeSobrenome")
public class ValidadorNomeSobrenome implements Validator {

    @Override
    public void validate(FacesContext facesContext, UIComponent uiComponent, Object o) throws ValidatorException {
        String nome = (String) o;
        String[] nomeSobr = nome.split(" ");
        if (nomeSobr.length < 2)
            throw new ValidatorException(
                    new FacesMessage("Erro",
                            "É necessário digitar nome e sobrenome"));
    }
}
