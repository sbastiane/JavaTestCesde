package org.example.helpers.tests;

import org.example.helpers.validaciones.BrandValidation;
import org.example.helpers.validaciones.CustomerValidation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class customervalidationTest {

    private CustomerValidation customerValidation;

    @BeforeEach
    public void setUp() {customerValidation = new CustomerValidation();}

    @Test
    public void testNamesValidate_ValidNames() throws Exception {
        CustomerValidation validation = new CustomerValidation();
        assertTrue(validation.namesValidate("John Doe"));
    }

    @Test
    public void testNamesValidate_TooLongNames(){
        CustomerValidation validation = new CustomerValidation();
        assertThrows(Exception.class, () -> {
            validation.namesValidate("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        });
    }

    @Test
    public void testNamesValidate_InvalidCharacters() {
        CustomerValidation validation = new CustomerValidation();
        assertThrows(Exception.class, () -> {
            validation.namesValidate("John123");
        });
    }

    @Test
    public void testEmailValidate_ValidEmail() throws Exception {
        CustomerValidation validation = new CustomerValidation();
        assertTrue(validation.emailValidate("john.doe@globant.com"));
    }

    @Test
    public void testEmailValidate_InvalidEmail() {
        CustomerValidation validation = new CustomerValidation();
        assertThrows(Exception.class, () -> {
            validation.emailValidate("john.doe@example.com");
        });
    }

    @Test
    public void testRegisterDateValidate_ValidDate() throws Exception {
        CustomerValidation validation = new CustomerValidation();
        assertTrue(validation.registerdatevalidate(LocalDate.of(2024, 5, 21)));
    }

    @Test
    public void testRegisterDateValidate_InvalidDate() {
        CustomerValidation validation = new CustomerValidation();
        assertThrows(Exception.class, () -> {
            validation.registerdatevalidate(LocalDate.of(2024, 13, 40));
        });
    }

    @Test
    public void testPhoneValidate_ValidPhone() throws Exception {
        CustomerValidation validation = new CustomerValidation();
        assertTrue(validation.phoneValidate("1234567890"));
    }

    @Test
    public void testPhoneValidate_InvalidPhone() {
        CustomerValidation validation = new CustomerValidation();
        assertThrows(Exception.class, () -> {
            validation.phoneValidate("1234");
        });
    }
}
