package shop.Jarvis.app.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shop.Jarvis.app.demo.calculator.entity.Item;
import shop.Jarvis.app.demo.calculator.entity.User;
import shop.Jarvis.app.demo.calculator.repository.ItemRepository;
import shop.Jarvis.app.demo.calculator.repository.UserRepository;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private ItemRepository itemRepository;
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		userRepository.save(new User(1, "thth", "수완", "@a", "1234", new Date()));
		userRepository.save(new User(2, "sp", "성필", "@b", "124", new Date()));
		userRepository.save(new User(3, "yr", "유림", "@c", "234", new Date()));

		List<User> users = userRepository.findAll();
		System.out.println("전체출력");
		for (User u : users) {
			System.out.println(u.toString());
		}
		System.out.println("검색한거만 찾아");
		for (User u : userRepository.findAllByName("검색")) {
			System.out.println(u.toString());
		}
		itemRepository.deleteAll();
		itemRepository.save(new Item(1, "갤럭시Z", 200, "신제품 2021", new Date()));
		itemRepository.save(new Item(2, "아이폰", 150, "신제품 2021", new Date()));
		itemRepository.save(new Item(3, "LG", 300, "신제품 2021", new Date()));
		List<Item> items = itemRepository.findAll();
		System.out.println("전체출력");
		for (Item i : items) {
			System.out.println(i.toString());
		}
	}
}
