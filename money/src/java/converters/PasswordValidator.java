/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import javax.faces.application.FacesMessage;  
import javax.faces.component.UIComponent;  
import javax.faces.context.FacesContext;  
import javax.faces.validator.Validator;  
import javax.faces.validator.ValidatorException;  

/**
 *
 * @author sunny
 */
public class PasswordValidator implements Validator {
    public void validate(FacesContext context, UIComponent component, Object obj)  
            throws ValidatorException {  
        String password = (String) obj;  
        if (password.length() < 6) {  
            FacesMessage message = new FacesMessage(  
                    FacesMessage.SEVERITY_ERROR, "文字長度不能小於6", "文字符號不能小於6");  
            throw new ValidatorException(message);  
        }  
        if (!password.matches(".+[0-9]+")) {  
            FacesMessage message = new FacesMessage(  
                    FacesMessage.SEVERITY_ERROR, "密碼必須包括字符與數字", "密碼必须是字符加數字所组成");  
            throw new ValidatorException(message);  
        }  
    }  
}
