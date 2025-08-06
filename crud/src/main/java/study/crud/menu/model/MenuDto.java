package study.crud.menu.model;

import lombok.Builder;
import lombok.Getter;

public class MenuDto {
    @Builder
    public static class Menu {
        private Integer idx;
        private String name;
        private Integer price;
        private Integer calorie;

        public static MenuDto.Menu from(MenuEntity entity) {
            MenuDto.Menu dto = Menu.builder()
                    .idx(entity.getIdx())
                    .name(entity.getName())
                    .price(entity.getPrice())
                    .build();

            return dto;
        }
    }

    @Getter
    public static class Register {
        private String name;
        private Integer price;
        private Integer calorie;
        public MenuEntity toEntity() {
            MenuEntity entity = MenuEntity.builder()
                    .name(name)
                    .price(price)
                    .calorie(calorie)
                    .build();
            return entity;
        }
    }
}
