package shop.Jarvis.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shop.Jarvis.app.demo.calculator.entity.User;
import shop.Jarvis.app.demo.calculator.repositorie.UserRepository;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		userRepository.save(new User("a","서수완","1","a@"));
		userRepository.save(new User("b","신유림","2","a@"));
		userRepository.save(new User("c","최성필","2","a@"));

		List<User>users = userRepository.findAll();
		System.out.println("전체출력");
		for(User u: users){
			System.out.println(u.toString());
		}
		System.out.println("서수완만 보여주세요");
		for(User u: userRepository.findAllByName("서수완")){
			System.out.println(u.toString());
		}

	}
}
