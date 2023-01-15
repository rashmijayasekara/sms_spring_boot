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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student rashmi=new Student(
                    "Rashmi",
                    "rashmijayasekara7899@gmail.com",
                    LocalDate.of(1997, Month.JANUARY,30)

            );
            Student nishani=new Student(
                    "Nishani",
                    "nishani@gmail.com",
                    LocalDate.of(1997,Month.JANUARY,12)
            );

            repository.saveAll(
                    List.of(rashmi,nishani)
            );

        };
    }
}
