package shop.Jarvis.app.demo.calculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.Jarvis.app.demo.calculator.entity.Item;
import shop.Jarvis.app.demo.calculator.service.ItemService;

import java.util.List;
import java.util.Optional;

@RestController@RequiredArgsConstructor
@RequestMapping("/items")
public class ItemController {
    private final ItemService itemService; //모듈화를 통해 강한 결속력을 준다아

    @GetMapping("/all") //컬브레이스를 걸면 변수
    public List<Item> findAll(){
        return itemService.findAll();
    }
    @GetMapping("/name/{name}") public List<Item> findAllByItemName(@PathVariable String name){
        return itemService.findAllByItemName(name);
    }

    @GetMapping("/id/{id}") public Optional<Item> findById(@PathVariable long id) {
        return itemService.findById(id);
    }
}
