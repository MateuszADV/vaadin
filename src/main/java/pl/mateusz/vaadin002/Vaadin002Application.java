package pl.mateusz.vaadin002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class Vaadin002Application {

	public static void main(String[] args) {
		SpringApplication.run(Vaadin002Application.class, args);
	}

	@Service
	public static class MyService{
		public String sayHi(){
			return "Hello World ussers!";
		}
	}
}
