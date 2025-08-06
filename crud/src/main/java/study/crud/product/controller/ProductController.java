package study.crud.product.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.crud.product.model.ProductDto;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) { this.productService = productService; }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody ProductDto.Register dto) {
        productService.register(dto);

        return ResponseEntity.status(200).body("상품 등록 성공");
    }

    @GetMapping("/list")
    public ResponseEntity list() {
        List<ProductDto.Product> response = productService.list();

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/read")
    public ResponseEntity read(Integer idx) {
        ProductDto.Product response = productService.read(idx);

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/search")
    public ResponseEntity search(String name) {
        List<ProductDto.Product> response = productService.search(name);

        return ResponseEntity.status(200).body(response);
    }
}
