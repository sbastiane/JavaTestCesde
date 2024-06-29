package org.example.helpers.tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.helpers.validaciones.BrandValidation;

public class brandvalidationTest {

    private BrandValidation brandValidation;

    @BeforeEach
    public void setUp() {
        brandValidation = new BrandValidation();
    }

    @Test
    public void testnameValidate_ValidName() {
        String validName = "Brand Name";
        Assertions.assertDoesNotThrow(() -> brandValidation.nameValidate(validName));
    }

    @Test
    public void testnameValidate_InvalidName_TooLong() {
        String invalidName = "This is a very long name for a brand that exceeds the maximum limit";
        Assertions.assertThrows(Exception.class, () -> brandValidation.nameValidate(invalidName));
    }

    @Test
    public void testcountryValidation_ValidCountry() {
        String validCountry = "Country";
        Assertions.assertDoesNotThrow(() -> brandValidation.countryValidation(validCountry));
    }

    @Test
    public void testcountryValidation_InvalidCountry_ContainsNumbers() {
        String invalidCountry = "Country123";
        Assertions.assertThrows(Exception.class, () -> brandValidation.countryValidation(invalidCountry));
    }

    @Test
    public void testemailValidation_ValidEmail() {
        String validEmail = "example@globant.com";
        Assertions.assertDoesNotThrow(() -> brandValidation.emailValidation(validEmail));
    }

    @Test
    public void testemailValidation_InvalidEmail_InvalidFormat() {
        String invalidEmail = "example.globant.com";
        Assertions.assertThrows(Exception.class, () -> brandValidation.emailValidation(invalidEmail));
    }

    @Test
    public void testemailValidation_InvalidEmail_NotGlobantDomain() {
        String invalidEmail = "example@gmail.com";
        Assertions.assertThrows(Exception.class, () -> brandValidation.emailValidation(invalidEmail));
    }
}
