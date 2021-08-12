package shop.Jarvis.app.demo.calculator.service;

import org.springframework.stereotype.Component;
import shop.Jarvis.app.demo.calculator.entity.Item;
import shop.Jarvis.app.demo.calculator.entity.User;

import java.util.List;
import java.util.Optional;

@Component
public interface ItemService {
    List<Item> findAll();
    List<Item> findAllByItemName(String itemName); //내가 만든거
    Optional<Item> findById(long id); //컴터가 부여한 아이디
}
