package ru.osalan.querydsl.service;

import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Pageable;
import ru.osalan.querydsl.dto.Product;

import java.util.List;

public interface ProductService {

    Product generateProduct();

    List<Product> getAllProducts(Predicate predicate, Pageable pageable);

}
