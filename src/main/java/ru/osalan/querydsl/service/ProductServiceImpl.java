package ru.osalan.querydsl.service;

import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.osalan.querydsl.dto.Product;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product generateProduct() {
        return null;
    }

    @Override
    public List<Product> getAllProducts(Predicate predicate, Pageable pageable) {
        return null;
    }
}
