package org.example.helpers.generals;

public enum Message {

    LENGTH_NAME("El nombre ingresado debe de tener menos de 70 caracteres"),
    FORMAT_NAME ("el nombre solo puede tener letras y espacios"),
    FORMAT_EMAIL("El correo debe tener la forma correo@globant.com"),
    DATE_REGISTER("fecha de registro (YYYY/MM/DD) se recomienda usar la clase LOCAL DATE"),
    PHONE_FORMAT("Debe tener 10 digitos"),
    BRAND_NAME("El nombre debe debe de tener menos de 50 caracteres"),
    BRAND_COUNTRY("Solo puede tener letras y solo 10 caracteres"),
    REPRESENTATIVE_EMAIL("Debe tener un formato de mail valido xxxx@globant.com"),
    DATE_FACTURE("fecha de registro (DD/MM/YYYY) se recomienda usar la clase LOCAL DATE")

    ;

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
