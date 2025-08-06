package study.crud.board.model;

import study.crud.product.model.ProductEntity;

public class BoardDto {
    public static class Board {
        private Integer idx;



        private String title;
        private String content;


        public static BoardDto.Board from(BoardEntity entity) {
            BoardDto.Board dto = new BoardDto.Board();
            dto.setIdx(entity.getIdx());
            dto.setTitle(entity.getTitle());
            dto.setContent(entity.getContent);

            return  dto;
        }

        public String getTitle() {
            return title;
        }


        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Integer getIdx() {
            return idx;
        }

        public void setIdx(Integer idx) {
            this.idx = idx;
        }

    }
}
