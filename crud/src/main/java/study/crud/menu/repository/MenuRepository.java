package study.crud.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {
    List<MenuEntity> findByName(String name);
}
