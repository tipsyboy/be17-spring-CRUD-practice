package study.crud.board.model;

import study.crud.product.model.ProductEntity;

public class BoardDto {
    public static class Board {
        private Integer id;
        private String name;
        private String content;

        public static BoardDto.Board from(BoardEntity entity) {
            BoardDto.Board dto = new BoardDto.Board();
            dto.setId(entity.getId());
            dto.setName(entity.getName());
            dto.setContent(entity.getContent());

            return dto;
        }


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

        public static class Register {
            private String name;
            private String content;


            public BoardEntity toEntity() {
                BoardEntity entity = new BoardEntity();
                entity.setName(name);
                entity.setContent(content);


                return entity;
            }


            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }
        }

    }

