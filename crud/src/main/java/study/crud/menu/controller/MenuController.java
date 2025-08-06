package study.crud.menu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import study.crud.menu.model.MenuDto;
import study.crud.menu.service.MenuService;
import study.crud.product.model.ProductDto;

import java.util.List;

@RequestMapping("/menu")
@RestController
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody MenuDto.Menu dto) {
        menuService.register(dto);

        return ResponseEntity
                .status(200)
                .body("상품 등록 성공");
    }

    @GetMapping("/list")
    public ResponseEntity<List<MenuDto.Menu>> list() {
        List<MenuDto.Menu> response = menuService.list();

        return ResponseEntity
                .status(200)
                .body(response);
    }

    @GetMapping("/read")
    public ResponseEntity<MenuDto.Menu> read(Integer idx) {
        MenuDto.Menu response = menuService.read(idx);

        return ResponseEntity
                .status(200)
                .body(response);
    }

    @GetMapping("/search")
    public ResponseEntity<List<MenuDto.Menu>> search(String name) {
        List<MenuDto.Menu> response = menuService.search(name);

        return ResponseEntity
                .status(200)
                .body(response);
    }
}
