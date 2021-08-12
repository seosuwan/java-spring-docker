package shop.Jarvis.app.demo.calculator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import shop.Jarvis.app.demo.calculator.entity.Item;
import shop.Jarvis.app.demo.calculator.entity.User;

import java.util.List;


@Repository

public interface ItemRepository extends MongoRepository<Item,Long> {
    List<Item> findAllByItemName(String itemName);


}
