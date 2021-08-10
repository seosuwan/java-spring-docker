package shop.Jarvis.app.demo.calculator.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceImplTest {
    @MockBean
    CalculatorServiceImpl calculatorService;


    @Test
    void createRandomNumber() {
        given(calculatorService.createRandomNumber()).willReturn(30);
        assertThat(calculatorService.createRandomNumber()).isEqualTo(30);

    }


}