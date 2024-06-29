package org.example.helpers.tests;
import org.example.helpers.validaciones.BrandValidation;
import org.example.models.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
public class customerTest {

    private Customer customer;

    @BeforeEach
    public void setUp() { customer = new Customer();}


    @Test
    public void testSetName_ValidName() {
        Customer customer = new Customer();
        String name = "John Doe";
        customer.setName(name);
        Assertions.assertEquals(name, customer.getName());
    }

    @Test
    public void testSetName_InvalidName() {
        Customer customer = new Customer();
        String name = "123";
        customer.setName(name);
        Assertions.assertNotEquals(name, customer.getName());
    }

    @Test
    public void testSetEmail_ValidEmail() {
        //Customer customer = new Customer();
        String vemail = "test@globant.com";
        customer.setEmail(vemail);
        Assertions.assertEquals(vemail, customer.getEmail());
    }

    @Test
    public void testSetEmail_InvalidEmail() {
        Customer customer = new Customer();
        String email = "test.globant.com";
        customer.setEmail(email);
        Assertions.assertNotEquals(email, customer.getEmail());
    }

    @Test
    public void testSetDate_ValidDate() {
        Customer customer = new Customer();
        LocalDate date = LocalDate.now();
        customer.setDate(date);
        Assertions.assertEquals(date, customer.getDate());
    }

    @Test
    public void testSetDate_InvalidDate() {
        Customer customer = new Customer();
        LocalDate date = LocalDate.of(2022, 12, 31);
        customer.setDate(date);
        Assertions.assertEquals(date, customer.getDate());
    }

    @Test
    public void testSetPhone_ValidPhone() {
        Customer customer = new Customer();
        String phone = "1234567890";
        customer.setPhone(phone);
        Assertions.assertEquals(phone, customer.getPhone());
    }

    @Test
    public void testSetPhone_InvalidPhone() {
        Customer customer = new Customer();
        String phone = "123";
        customer.setPhone(phone);
        Assertions.assertNotEquals(phone, customer.getPhone());
    }
}
