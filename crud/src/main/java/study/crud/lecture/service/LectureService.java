package study.crud.lecture.service;

import org.springframework.stereotype.Service;
import study.crud.lecture.model.LectureDto;
import study.crud.lecture.model.LectureEntity;
import study.crud.lecture.repository.LectureRepository;

import java.util.List;
import java.util.Optional;

@Service
public class LectureService {

    private final LectureRepository lectureRepository;

    public LectureService(LectureRepository lectureRepository) {
        this.lectureRepository = lectureRepository;
    }


    public void register(LectureDto.Register dto) {
        lectureRepository.save(dto.toEntity());
    }

    public List<LectureDto.Lecture> list() {
        List<LectureEntity> result = lectureRepository.findAll();

        return result.stream()
                .map(LectureDto.Lecture::from)
                .toList();
    }

    public LectureDto.Lecture read(Integer idx) {
        Optional<LectureEntity> result = lectureRepository.findById(idx);

        if (result.isPresent()) {
            LectureEntity entity = result.get();

            return LectureDto.Lecture.from(entity);
        }

        return null;
    }

    public List<LectureDto.Lecture> search(String name) {
        List<LectureEntity> result = lectureRepository.findByName(name);

        return result.stream()
                .map(LectureDto.Lecture::from)
                .toList();
    }
}
