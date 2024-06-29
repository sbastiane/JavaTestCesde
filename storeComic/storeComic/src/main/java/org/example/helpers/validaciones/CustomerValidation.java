package org.example.helpers.validaciones;

import org.example.helpers.generals.General;
import org.example.helpers.generals.Message;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.format.DateTimeFormatter;

public class CustomerValidation {

    //Inyectando la dependencia a la clase general

    private General general = new General();

    //Las clases de validacion
    //normalmente SOLO tienen metodos
    //Con la logica de validacion



    public boolean namesValidate(String names) throws Exception{

        //Establecer rutinas para validar el campo nombres
        //segun las reglas del negocio

        //1. La cadena del nombre solo puede tener hasta 70 caracteres
        if (names.length()>70){// me pase de caracteres
            throw new Exception(Message.LENGTH_NAME.getMessage());
        }

        //2. La cadena del nombre solo puede tener letras aA zZ y espacios
        // Pasos para aplicar un REGEX
        String regex ="^[a-zA-Z ]+$";
        boolean matcher=this.general.regexValidation(regex,names);
        if (!matcher){ //NO HUBO COINCIDENCIA
            throw new Exception(Message.FORMAT_NAME.getMessage());
        }

        // Retorno true si todas las validaciones pasan con exito
        return true;
    }

    public boolean emailValidate(String email) throws Exception{
        String regex = "^[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*@globant\\.com$";
        boolean matcher=this.general.regexValidation(regex,email);
        if (!matcher){ //NO HUBO COINCIDENCIA
            throw new Exception(Message.FORMAT_EMAIL.getMessage());
        }
        return true;
    }

    public boolean registerdatevalidate(LocalDate Registerdate) throws Exception {
        String formattedDate = Registerdate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        String regex = "\\d{4}/(0[1-9]|1[0-2])/(0[1-9]|[1-2][0-9]|3[0-1])";
        boolean matcher = formattedDate.matches(regex);
        if (!matcher){ //NO HUBO COINCIDENCIA
            throw new Exception(Message.DATE_REGISTER.getMessage());
        }
        return true;
    }

    public boolean phoneValidate(String phone)throws Exception{
        String regex = "^\\d{10}$";
        boolean matcher=this.general.regexValidation(regex,phone);
        System.out.println(matcher);
        if (!matcher){ //NO HUBO COINCIDENCIA
            throw new Exception(Message.PHONE_FORMAT.getMessage());
        }
        return true;
    }
}
