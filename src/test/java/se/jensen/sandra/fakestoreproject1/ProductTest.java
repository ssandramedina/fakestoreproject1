package se.jensen.sandra.fakestoreproject1;

import org.junit.jupiter.api.Test;
import se.jensen.sandra.fakestoreproject1.model.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    void productCanStoreTitle() {

        Product product = new Product();

        product.setTitle("Tröja");

        assertEquals("Tröja", product.getTitle());
    }

}