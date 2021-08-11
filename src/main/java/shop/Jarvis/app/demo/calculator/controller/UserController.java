package shop.Jarvis.app.demo.calculator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.Jarvis.app.demo.calculator.entity.User;
import shop.Jarvis.app.demo.calculator.service.UserServiceImpl;

import java.util.List;

@RestController@RequiredArgsConstructor
public final class UserController {
    private final UserServiceImpl userService;
    @GetMapping("/users/all")
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("/users/name/{name}")
    public List<User> findBuName(@PathVariable String name){
        return userService.findAllByName(name);
    }

}
