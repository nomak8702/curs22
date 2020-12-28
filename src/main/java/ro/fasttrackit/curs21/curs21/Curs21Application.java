package ro.fasttrackit.curs21.curs21;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs21.curs21.web.model.Transaction;
import ro.fasttrackit.curs21.curs21.web.model.Type;
import ro.fasttrackit.curs21.curs21.web.repository.TransactionRepostory;

import java.util.List;

@SpringBootApplication
public class Curs21Application {

	public static void main(String[] args) {
		SpringApplication.run(Curs21Application.class, args);
	}

	@Bean
	CommandLineRunner atStartUp(TransactionRepostory repo){
		return args -> repo.saveAll(List.of(
				new Transaction("bread", Type.BUY,85.5),
				new Transaction("car", Type.SELL,95.5),
				new Transaction("laptop", Type.BUY,98.5),
				new Transaction("phone", Type.SELL,58.5)
		));


	}

}
