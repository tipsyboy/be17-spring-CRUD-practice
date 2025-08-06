package study.crud.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.crud.board.model.BoardEntity;

import java.util.List;

public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
    List<BoardEntity> findByName(String name);
}
