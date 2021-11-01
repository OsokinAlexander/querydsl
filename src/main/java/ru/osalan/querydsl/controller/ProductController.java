package ru.osalan.querydsl.controller;

import com.querydsl.core.types.Predicate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.osalan.querydsl.entity.ProductEntity;
import ru.osalan.querydsl.service.ProductService;
import springfox.documentation.annotations.ApiIgnore;

@AllArgsConstructor
@RestController("ProductsController_v1")
@RequestMapping("/products")
@Api(value = "Mass operation with products", tags = {"Product"})
public class ProductController {

    private ProductService productService;

    @GetMapping
    @ApiOperation("Get all products with filtering")
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "OK"),
//            @ApiResponse(code = 422, message = "API Exception"),
//            @ApiResponse(code = 500, message = "Internal Server Error")}
//    )
    public ResponseEntity<?> getAllProduct(
            @ApiIgnore
            @QuerydslPredicate(root = ProductEntity.class)
                    Predicate predicate,
            @PageableDefault
                    Pageable pageable
    ) {
        return ResponseEntity.ok(productService.getAllProducts(predicate, pageable));
    }

}
