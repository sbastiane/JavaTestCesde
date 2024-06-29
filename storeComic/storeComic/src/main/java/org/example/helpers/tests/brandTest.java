package org.example.helpers.tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.models.Brand;

public class brandTest {

    private Brand brand;

    @BeforeEach
    public void setUp() {
        brand = new Brand();
    }

    @Test
    public void testSetName_ValidName() {
        String validName = "Brand Name";
        brand.setName(validName);
        Assertions.assertEquals(validName, brand.getName());
    }

    @Test
    public void testSetName_InvalidName_TooLong() {
        String invalidName = "This is a very long name for a brand that exceeds the maximum limit";
        brand.setName(invalidName);
        Assertions.assertNotEquals(invalidName, brand.getName());
    }

    @Test
    public void testSetCountry_ValidCountry() {
        String validCountry = "Country";
        brand.setCountry(validCountry);
        Assertions.assertEquals(validCountry, brand.getCountry());
    }

    @Test
    public void testSetCountry_InvalidCountry_ContainsNumbers() {
        String invalidCountry = "Country123";
        brand.setCountry(invalidCountry);
        Assertions.assertNotEquals(invalidCountry, brand.getCountry());
    }

    @Test
    public void testSetEmail_ValidEmail() {
        String validEmail = "example@globant.com";
        brand.setEmail(validEmail);
        Assertions.assertEquals(validEmail, brand.getEmail());
    }

    @Test
    public void testSetEmail_InvalidEmail_InvalidFormat() {
        String invalidEmail = "example.globant.com";
        brand.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail, brand.getEmail());
    }

    @Test
    public void testSetEmail_InvalidEmail_NotGlobantDomain() {
        String invalidEmail = "example@gmail.com";
        brand.setEmail(invalidEmail);
        Assertions.assertNotEquals(invalidEmail, brand.getEmail());
    }
}
