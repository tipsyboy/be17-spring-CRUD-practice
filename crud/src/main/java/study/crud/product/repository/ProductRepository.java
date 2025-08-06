package study.crud.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.crud.product.model.ProductDto;
import study.crud.product.model.ProductEntity;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
    List<ProductEntity> findByName(String name);
}
