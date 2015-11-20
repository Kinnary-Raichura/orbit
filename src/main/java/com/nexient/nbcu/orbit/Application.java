package com.nexient.nbcu.orbit;

/**
 * Created by kraichura on 11/16/2015.
 */
import com.nexient.nbcu.orbit.model.Deal;
import com.nexient.nbcu.orbit.repository.DealRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(final DealRepository dealRepository) {

        return new CommandLineRunner() {

            @Override
            public void run(String... arg0) throws Exception {
                dealRepository.save(new Deal("Customer 1", "Deal maker 1", "Description 1","Project A"));
                dealRepository.save(new Deal("Customer 2", "Deal maker 2", "Description 2","Project A"));
                dealRepository.save(new Deal("Customer 3", "Deal maker 3", "Description 3","Project A"));
                dealRepository.save(new Deal("Customer 4", "Deal maker 4", "Description 4","Project A"));
                dealRepository.save(new Deal("Customer 5", "Deal maker 5", "Description 5","Project A"));
            }

        };

    }
}