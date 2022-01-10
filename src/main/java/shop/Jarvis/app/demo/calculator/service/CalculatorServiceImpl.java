package shop.Jarvis.app.demo.calculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.Jarvis.app.demo.calculator.entity.Calculator;
import shop.Jarvis.app.demo.calculator.repository.CalculatorRepo;

@Service@RequiredArgsConstructor
public class CalculatorServiceImpl implements CalculatorService{
    private final CalculatorRepo calculatorRepo;

    @Override
    public int createRandomNumber() {

        return (int)(Math.random()*100)+1;
    }

}
