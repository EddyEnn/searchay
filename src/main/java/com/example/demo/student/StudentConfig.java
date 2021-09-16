package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    //To have access to our repository
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
//        return args -> {
//            Student Tshepang = new Student("Tshepang", "tshepang@gmail.com", LocalDate.of(2001, Month.MARCH, 1));
//            Student edwin = new Student("Edwin", "edwin@gmail.com", LocalDate.of(1987, Month.MARCH, 1));
//            studentRepository.saveAll(Arrays.asList(Tshepang, edwin));
//        };
//    }
}
