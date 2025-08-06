package study.crud.lecture.model;

import lombok.Builder;
import lombok.Getter;

public class LectureDto {
    @Getter
    @Builder
    public static class Lecture {
        private Integer idx;
        private String title;
        private String description;
        private Integer time;
        private Integer price;

        public static LectureDto.Lecture from(LectureEntity entity){
            LectureDto.Lecture dto = Lecture.builder()
                    .idx(entity.getIdx())
                    .title(entity.getTitle())
                    .description(entity.getDescription())
                    .time(entity.getTime())
                    .price(entity.getPrice())
                    .build();

            return dto;
        }
    }

    @Getter
    public static class Register {
        private String title;
        private String description;
        private Integer time;
        private Integer price;

        public LectureEntity toEntity(){
            LectureEntity entity = LectureEntity.builder()
                    .title(title)
                    .description(description)
                    .time(time)
                    .price(price)
                    .build();
            return entity;
        }
    }
}
