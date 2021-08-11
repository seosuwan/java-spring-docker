package shop.Jarvis.app.demo.calculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.Jarvis.app.demo.calculator.entity.User;
import shop.Jarvis.app.demo.calculator.repositorie.UserRepository;

import java.util.List;

@Service @RequiredArgsConstructor
public class UserServiceImpl {
    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public List<User> findAllByName(String name){
        return userRepository.findAllByName(name);
    }
}
