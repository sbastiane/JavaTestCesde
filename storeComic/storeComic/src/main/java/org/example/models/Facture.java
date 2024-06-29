package org.example.models;

import org.example.helpers.validaciones.FactureValidation;

import java.time.LocalDate;
import java.util.ArrayList;

public class Facture {

    //ID
    private Integer id;
    //DATE (DD-MM-YYYY) local date
    private LocalDate date;
    //Productlist: "Revisar Arraylist"
    private String productList;
    //Grosscost
    private double grosscost;
    //Netcost (Aplicar IVA y descontar descuentos)
    private double netcost;

    private FactureValidation factureValidation = new FactureValidation();

    public Facture() {
    }

    public Facture(java.lang.Integer id, LocalDate date, java.lang.String productList, double grosscost, double netcost) {
        this.id = id;
        this.date = date;
        this.productList = productList;
        this.grosscost = grosscost;
        this.netcost = netcost;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {

        try {
            this.factureValidation.dateValidation(date);
            this.date = date;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        try {
            this.factureValidation.productListValidation(productList);
            this.productList = productList;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public double getGrosscost() {
        return grosscost;
    }

    public void setGrosscost(double grosscost) {
        this.grosscost = grosscost;
    }

    public double getNetcost() {
        return netcost;
    }

    public void setNetcost(double netcost) {
        try {
            this.factureValidation.netcostValidation(netcost);
            this.netcost = netcost;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
