package com.javatechie;

import com.javatechie.entity.Employee;
import com.javatechie.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@SpringBootApplication
public class JpaPerformanceApplication {

//    @Autowired
//    private EmployeeRepository repository;
//
//    @PostConstruct
//    public void initDB()  {
//
//        List<Employee> employees = IntStream.rangeClosed(3001, 100000)
//                .mapToObj(i -> new Employee("emp" + i, "dept" + i, "employee" + i + "@gmail.com", getGender(), generateSalary(50000, 100000))).collect(Collectors.toList());
//
//        repository.saveAll(employees);
//    }
//
//    private String getGender(){
//        return new Random().nextBoolean()?"Male":"Female";
//    }
//
//    public static double generateSalary(double min, double max) {
//        // Generate a random double in the range 0.0 to 1.0
//        Random random = new Random();
//        double randomValue = random.nextDouble();
//
//        // Scale it to the range [min, max]
//        return min + (randomValue * (max - min));
//    }

    public static void main(String[] args) {
        SpringApplication.run(JpaPerformanceApplication.class, args);
    }

}
