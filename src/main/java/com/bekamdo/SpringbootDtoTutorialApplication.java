package com.bekamdo;

import com.bekamdo.model.Location;
import com.bekamdo.model.User;
import com.bekamdo.repository.LocationRepository;
import com.bekamdo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDtoTutorialApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDtoTutorialApplication.class, args);
	}
    @Autowired
	private  UserRepository userRepository;
	@Autowired
	private LocationRepository locationRepository;
	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Ngata");
		location.setDescription("Ngata is great place to live");
		location.setLongitude(40.55);
		location.setLongitude(56.99);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Ben");
		user1.setLastName("Kamau");
		user1.setEmail("bekamdo@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);


		User user2 = new User();
		user2.setFirstName("Wambui");
		user2.setLastName("Martha");
		user2.setEmail("martha@gmail.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);


	}
}
