package org.example.models;

import org.example.helpers.validaciones.ProductValidation;

public class Product {


    private Integer id;
    //Id
    private String name;
    //Name = solo se aceptan letras y espacios
    private Integer price;
    //Price = solo se aceptan numeros

    private String description;
    //Description = solo se aceptan cadenas hasta 50 caracteres

    private String photo;
    //Photo

    private String review;
    //Review

    private String brand;
    //Brand

    private ProductValidation productValidation = new ProductValidation();

    public Product() {
    }

    public Product(Integer id, String name, Integer price, String description, String photo, String review, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.photo = photo;
        this.review = review;
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            this.productValidation.namevalidation(name);
            this.name = name;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        try {
            this.productValidation.priceValidation(price);
        this.price = price;
    }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        try {
        this.productValidation.descriptionValidation(description);
        this.description = description;
    }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
