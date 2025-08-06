package study.crud.lecture.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.crud.lecture.model.LectureDto;
import study.crud.lecture.service.LectureService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lecture")
public class LectureController {
    private final LectureService lectureService;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody LectureDto.Register dto) {
        lectureService.register(dto);

        return ResponseEntity.status(200).body("강의 등록 성공");
    }

    @GetMapping("/list")
    public ResponseEntity list() {
        List<LectureDto.Lecture> response = lectureService.list();

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/read")
    public ResponseEntity read(Integer idx) {
        LectureDto.Lecture response = lectureService.read(idx);

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/search")
    public ResponseEntity search(String name) {
        List<LectureDto.Lecture> response = lectureService.search(name);

        return ResponseEntity.status(200).body(response);
    }
}
