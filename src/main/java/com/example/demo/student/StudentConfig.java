package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student luis = new Student(
                    "Luis",
                    "luis.gabo.rex@gmail.com",
                    LocalDate.of(2001, Month.JUNE, 29),
                    24
            );
            Student juan = new Student(
                    "Juan",
                    "cneacBalancan@gmail.com",
                    LocalDate.of(1967, Month.DECEMBER, 6),
                    58
            );

            repository.saveAll(
                    List.of(luis, juan)
            );
        };
    }
}
