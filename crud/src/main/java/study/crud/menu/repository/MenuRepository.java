package study.crud.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.crud.menu.model.MenuEntity;

import java.util.List;

public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {
    List<MenuEntity> findByName(String name);
}
