/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author 伶娸
 */
@FacesConverter(value = "converters.cardNumberConverter")
public class CardNumberConverter implements Converter{
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String string) {
         String cardNumStr = string.replaceAll("[-\\s]+", "");
        return cardNumStr;
}
    
  @Override
    public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
        String inputVal = (String) arg2;
        char [] input = inputVal.toCharArray();
        StringBuilder bf = new StringBuilder();
        for(int i=0 ; i<input.length ; i++){
            if (((i-2)%3) == 0 && i !=0){
                bf.append("-");
            }
            bf.append(input[i]);
        }
        return bf.toString();
    }
}
