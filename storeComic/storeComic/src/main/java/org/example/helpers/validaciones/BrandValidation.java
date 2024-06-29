package org.example.helpers.validaciones;

import org.example.helpers.generals.General;
import org.example.helpers.generals.Message;

public class BrandValidation {

    private General general = new General();
    //Validar Brandclass

    public boolean nameValidate (String Name)throws Exception{
        if (Name.length()>50){// me pase de caracteres
            throw new Exception(Message.BRAND_NAME.getMessage());
        }
        return true;
    }

    public boolean countryValidation (String country)throws Exception{
        String regex = "[a-zA-Z]{1,10}";
        boolean matcher=this.general.regexValidation(regex,country);
        if (!matcher){ //NO HUBO COINCIDENCIA
            throw new Exception(Message.BRAND_COUNTRY.getMessage());
        }
        return true;
    }

    public boolean emailValidation (String Email) throws Exception{

        String regex = "^[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*@globant\\.com$";
        boolean matcher = this.general.regexValidation(regex,Email);
        if (!matcher) { //NO HUBO COINCIDENCIA
            throw new Exception(Message.REPRESENTATIVE_EMAIL.getMessage());
        }
        return true;
    }
}
