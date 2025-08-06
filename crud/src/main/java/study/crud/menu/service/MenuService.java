package study.crud.menu.service;

import org.springframework.stereotype.Service;
import study.crud.menu.model.MenuDto;
import study.crud.menu.model.MenuEntity;
import study.crud.menu.repository.MenuRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MenuService {
    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    public void register(MenuDto.Register dto) {
        menuRepository.save(dto.toEntity());
    }

    public List<MenuDto.Menu> list() {
        List<MenuEntity> result = menuRepository.findAll();
        return result.stream().map(MenuDto.Menu::from).toList();
    }

    public MenuDto.Menu read(Integer idx) {
        Optional<MenuEntity> result = menuRepository.findById(idx);

        if (result.isPresent()) {
            MenuEntity entity = result.get();
            return MenuDto.Menu.from(entity);
        }
        return null;
    }

    public List<MenuDto.Menu> search(String name) {
        List<MenuEntity> result = MenuRepository.findByName(name);
        return result.stream().map(MenuDto.Menu::from).toList();
    }
}
