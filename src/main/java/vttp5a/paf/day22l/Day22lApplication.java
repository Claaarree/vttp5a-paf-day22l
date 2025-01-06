package vttp5a.paf.day22l;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import vttp5a.paf.day22l.repository.KindleRepository;

@SpringBootApplication
public class Day22lApplication implements CommandLineRunner {

	@Autowired
	KindleRepository kindleRepo;

	public static void main(String[] args) {
		SpringApplication.run(Day22lApplication.class, args);
	}

	@Override
	public void run(String... args) {
	   kindleRepo.getAuthorAverageRating(100, 10);
	}

}
