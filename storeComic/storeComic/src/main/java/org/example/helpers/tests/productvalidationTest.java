package org.example.helpers.tests;

import org.example.helpers.validaciones.ProductValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class productvalidationTest {
    private ProductValidation productValidation;

    @BeforeEach
    public void setUp() {
        productValidation = new ProductValidation();
    }

    @Test
    public void testValidNameValidation() {
        String name = "Product Name";
        Assertions.assertDoesNotThrow(() -> productValidation.namevalidation(name));
    }

    @Test
    public void testInvalidNameValidation() {
        String name = "12345";
        Assertions.assertThrows(Exception.class, () -> productValidation.namevalidation(name));
    }

    @Test
    public void testValidPriceValidation() {
        int price = 10;
        Assertions.assertDoesNotThrow(() -> productValidation.priceValidation(price));
    }

    @Test
    public void testInvalidPriceValidation() {
        int price = -10;
        Assertions.assertThrows(Exception.class, () -> productValidation.priceValidation(price));
    }

    @Test
    public void testValidDescriptionValidation() {
        String description = "This is a valid description with more than.";
        Assertions.assertDoesNotThrow(() -> productValidation.descriptionValidation(description));
    }

    @Test
    public void testInvalidDescriptionValidation() {
        String description = "This is a short description detfrefef fryger syfgesf fasyfges fnaurgragaearg.";
        Assertions.assertThrows(Exception.class, () -> productValidation.descriptionValidation(description));
    }
}
