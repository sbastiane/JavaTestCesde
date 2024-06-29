package org.example.models;

import org.example.helpers.validaciones.CustomerValidation;

import java.time.LocalDate;
public class Customer {
//ID
private Integer id;
//Names (Que solo se puedan letras y espacios y maximo 70 caracteres)
private String name;
// Email
private String Email;
// fecha de registro (YYYY/MM/DD) se recomienda usar la clase LOCAL DATE
private LocalDate date;
//Telefono (Debe tener 10 digitos)
private String phone;

//Inyectando una dependencia de la clase CustomerValidation
    private CustomerValidation customerValidation = new  CustomerValidation();

public Customer() {

}

    public Customer(java.lang.Integer id, java.lang.String name, java.lang.String email, LocalDate date, java.lang.String phone) {
        this.id = id;
        this.name = name;
        this.Email = email;
        this.date = date;
        this.phone = phone;
    }

    public java.lang.Integer getId() {
        return id;
    }

    public void setId(java.lang.Integer id) {
        if (id>0){
        this.id=id;
        }else {
            System.out.println("Revise ya que no se aceptan id negativos");
        }
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {

    try{
        this.customerValidation.namesValidate(name);
        this.name = name;

    }catch (Exception error){
        System.out.println(error.getMessage());
    }

    }

    public java.lang.String getEmail() {
        return Email;
    }

    public void setEmail(java.lang.String email) {
        try{
            this.customerValidation.emailValidate(email);
            this.Email = email;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
    try {
        this.customerValidation.registerdatevalidate(date);
        this.date = date;
    }
    catch (Exception e) {
        System.out.println(e.getMessage());
    }

    }

    public java.lang.String getPhone() {
        return phone;
    }

    public void setPhone(java.lang.String phone) {
        try{
            this.customerValidation.phoneValidate(phone);
            this.phone = phone;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
