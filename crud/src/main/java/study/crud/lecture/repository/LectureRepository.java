package study.crud.lecture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.crud.lecture.model.LectureEntity;
import study.crud.menu.model.MenuEntity;

import java.util.List;

public interface LectureRepository extends JpaRepository<LectureEntity, Integer> {
    List<LectureEntity> findByTitle(String title);
}

