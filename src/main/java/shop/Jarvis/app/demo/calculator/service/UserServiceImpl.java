package shop.Jarvis.app.demo.calculator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.Jarvis.app.demo.calculator.entity.User;
import shop.Jarvis.app.demo.calculator.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override public List<User> findAll(){
        return userRepository.findAll();
    }
    @Override public List<User> findAllByName(String name){
        return userRepository.findAllByName(name);
    }

    @Override
    public Optional<User> findById(long id) {
        return userRepository.findById(id);
    }

}
