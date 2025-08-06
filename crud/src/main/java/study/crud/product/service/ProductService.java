package study.crud.product.service;

import org.springframework.stereotype.Service;
import study.crud.product.model.ProductDto;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public void register(ProductDto.Register dto) {
        productRepository.save(dto.toEntity())
    }

    public List<ProductDto.Product> list() {
        List<ProductEntity> result = productRepository.findAll();

        return result.stream()
                .map(ProductDto.Product::from)
                .toList();
    }

    public ProductDto.Product read(Integer idx) {
        Optional<ProductEntity> result = productRepository.findById(idx);

        if (result.isPresent()) {
            ProductEntity entity = result.get();

            return ProductDto.Product.from(entity);
        }

        return null;
    }

    public List<ProductDto.Product> search(String name) {
        List<ProductEntity> result = productRepository.findByName(name);

        return result.stream()
                .map(ProductDto.Product::from)
                .toList();
    }
}
