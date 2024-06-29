package org.example.helpers.validaciones;

import org.example.helpers.generals.General;

public class ProductValidation {

    //Validacion producto

    private General general = new General();
    //Validacion producto

    public boolean namevalidation(String date) throws Exception {
        String regex = "^[a-zA-Z\s]+$";
        boolean coincidencia = this.general.regexValidation(regex, date);

        if (coincidencia != true) {
            throw new Exception("Error! debes ingresar solo letras y espacios");
        }

        return true;
    }

    public boolean priceValidation(Integer price) throws Exception {

        if (price < 0) {
            throw new Exception("Error! has ingresado un valor del producto Negativo.");
        }

        return true;
    }

    public boolean descriptionValidation(String description) throws Exception {


        //Valida que al menos en la descripcion sean 50 caracteres
        String regex = "^.{1,50}$";
        boolean coincidencia = this.general.regexValidation(regex, description);

        if (coincidencia != true) {
            throw new Exception("Error! solo podras ingresar menos ed 50 caracteres a la descripcion de este producto.");
        }

        return true;


    }
}

