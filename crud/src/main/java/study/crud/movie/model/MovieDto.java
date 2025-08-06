package study.crud.movie.model;

public class MovieDto {

    public static class Movie {
        private Integer idx;
        private String title;
        private String description;
        private Integer showTime;

        public static MovieDto.Movie from(MovieEntity entity){
            MovieDto.Movie dto = new MovieDto.Movie();
            dto.setIdx(entity.getIdx());
            dto.setTitle(entity.getTitle());
            dto.setDescription(entity.getDescription());
            dto.setShowTime(entity.getShowTime());
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

        public Integer getShowTime() {
            return showTime;
        }

        public void setShowTime(Integer showTime) {
            this.showTime = showTime;
        }
    }

    public static class Register {
        private String title;
        private String description;
        private Integer showTime;

        public MovieEntity toEntity() {
            MovieEntity entity = new MovieEntity();
            entity.setTitle(title);
            entity.setDescription(description);
            entity.setShowTime(showTime);

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

        public Integer getShowTime() {
            return showTime;
        }

        public void setShowTime(Integer showTime) {
            this.showTime = showTime;
        }
    }
}
