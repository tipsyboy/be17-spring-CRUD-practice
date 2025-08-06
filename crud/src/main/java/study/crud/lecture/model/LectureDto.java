package study.crud.lecture.model;

public class LectureDto {
    public static class Lecture {
        private Integer idx;
        private String title;
        private String description;
        private Integer time;
        private Integer price;

        public static LectureDto.Lecture from(LectureEntity entity){
            LectureDto.Lecture dto = new LectureDto.Lecture();
            dto.setIdx(entity.getIdx());
            dto.setTitle(entity.getTitle());
            dto.setDescription(entity.getDescription());
            dto.setTitle(entity.getTime());
            dto.setPrice(entity.getPrice());

            return dto;
        }

        public Integer getIdx() {
            return idx;
        }

        public void setIdx(Integer idx) {
            this.idx = idx;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }

    public static class Register {
        private String title;
        private String description;
        private Integer time;
        private Integer price;

        public LectureEntity toEntity(){
            LectureEntity entity = new LectureEntity();
            entity.setTitle(title);
            entity.setDescription(description);
            entity.setTime(time);
            entity.setPrice(price);
            return entity;
        }
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }
}
