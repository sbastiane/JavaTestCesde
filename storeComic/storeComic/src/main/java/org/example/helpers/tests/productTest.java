package org.example.helpers.tests;
import org.example.helpers.validaciones.BrandValidation;
import org.example.models.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class productTest {

    private Product product;

    @BeforeEach
    public void setUp() {product = new Product();}

    @Test
    public void testSetName_ValidName() {
        Product product = new Product();
        String name = "Product Name";
        product.setName(name);
        Assertions.assertEquals(name, product.getName());
    }

    @Test
    public void testSetName_InvalidName() {
        Product product = new Product();
        String name = "123";
        product.setName(name);
        Assertions.assertNotEquals(name, product.getName());
    }

    @Test
    public void testSetPrice_ValidPrice() {
        Product product = new Product();
        Integer price = 100;
        product.setPrice(price);
        Assertions.assertEquals(price, product.getPrice());
    }

    @Test
    public void testSetPrice_InvalidPrice() {
        Product product = new Product();
        Integer price = -100;
        product.setPrice(price);
        Assertions.assertNotEquals(price, product.getPrice());
    }

    @Test
    public void testSetDescription_ValidDescription() {
        Product product = new Product();
        String description = "Product Description";
        product.setDescription(description);
        Assertions.assertEquals(description, product.getDescription());
    }

    @Test
    public void testSetDescription_InvalidDescription() {
        Product product = new Product();
        String description = "This is a very long product description that exceeds the limit of 50 characters";
        product.setDescription(description);
        Assertions.assertNotEquals(description, product.getDescription());
    }

    @Test
    public void testSetPhoto() {
        Product product = new Product();
        String photo = "product.jpg";
        product.setPhoto(photo);
        Assertions.assertEquals(photo, product.getPhoto());
    }

    @Test
    public void testSetReview() {
        Product product = new Product();
        String review = "Product Review";
        product.setReview(review);
        Assertions.assertEquals(review, product.getReview());
    }

    @Test
    public void testSetBrand() {
        Product product = new Product();
        String brand = "Product Brand";
        product.setBrand(brand);
        Assertions.assertEquals(brand, product.getBrand());
    }
}
