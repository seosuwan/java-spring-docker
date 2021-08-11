package shop.Jarvis.app.demo.calculator.repositorie;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import shop.Jarvis.app.demo.calculator.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User,Long> {
    List<User> findAllByName(String name);
}
