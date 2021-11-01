package ru.osalan.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.osalan.querydsl.entity.ProductEntity;

import java.math.BigInteger;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, BigInteger> {
}
