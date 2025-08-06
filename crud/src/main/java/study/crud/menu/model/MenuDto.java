package study.crud.menu.model;

public class MenuDto {
    public static class Menu {
        private Integer idx;
        private String name;
        private Integer price;
        private Integer calorie;

        public static MenuDto.Menu from(MenuEntity entity) {
            MenuDto.Menu dto = new MenuDto.Menu();
            dto.setIdx(entity.getIdx());
            dto.setName(entity.getName());
            dto.setPrice(entity.getPrice());
            dto.setCalorie(entity.getCalorie());

            return dto;
        }

        public Integer getIdx() {
            return idx;
        }

        public void setIdx(Integer idx) {
            this.idx = idx;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public Integer getCalorie() {
            return calorie;
        }

        public void setCalorie(Integer calorie) {
            this.calorie = calorie;
        }

        public static class Register {
            private String name;
            private Integer price;
            private Integer calorie;

            public MenuEntity toEntity() {
                MenuEntity entity = new MenuEntity();
                entity.setName(name);
                entity.setPrice(price);
                entity.setCalorie(calorie);
                return entity;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getPrice() {
                return price;
            }

            public void setPrice(Integer price) {
                this.price = price;
            }

            public Integer getCalorie() {
                return calorie;
            }

            public void setCalorie(Integer calorie) {
                this.calorie = calorie;
            }
        }
    }
}
