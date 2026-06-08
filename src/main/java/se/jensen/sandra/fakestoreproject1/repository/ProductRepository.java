package se.jensen.sandra.fakestoreproject1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.jensen.sandra.fakestoreproject1.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
