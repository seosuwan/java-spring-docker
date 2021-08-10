package shop.Jarvis.app.demo.calculator.repositorie;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import shop.Jarvis.app.demo.calculator.entity.Calculator;
@Repository
public interface CalculatorRepo extends MongoRepository<Calculator, Long> {

}
