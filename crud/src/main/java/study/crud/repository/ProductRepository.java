package study.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.crud.model.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
