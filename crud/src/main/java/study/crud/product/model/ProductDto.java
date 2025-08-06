package study.crud.product.model;

public class ProductDto {
    public static class Product {
        private Integer idx;
        private String name;
        private String description;
        private Integer price;

        public static ProductDto.Product from(ProductEntity entity){
            ProductDto.Product dto = new ProductDto.Product();
            dto.setIdx(entity.getIdx());
            dto.setName(entity.getName());
            dto.setDescription(entity.getDescription());
            dto.setPrice(entity.getPrice());

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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }

    public static class Register {
        private String name;
        private String description;
        private Integer price;

        public ProductEntity toEntity() {
            ProductEntity entity = new ProductEntity();
            entity.setName(name);
            entity.setDescription(description);
            entity.setPrice(price);

            return entity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }
}
