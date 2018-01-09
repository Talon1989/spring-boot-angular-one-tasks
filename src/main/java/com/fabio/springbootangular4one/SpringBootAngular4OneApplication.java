package com.fabio.springbootangular4one;

import com.fabio.springbootangular4one.domain.Task;
import com.fabio.springbootangular4one.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class SpringBootAngular4OneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngular4OneApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(TaskService taskService){
		return args -> {
			taskService.save( new Task("Task number 1", LocalDate.now(), true) );
			taskService.save( new Task("Task number 2", LocalDate.now().plus(1, ChronoUnit.DAYS), false) );
			taskService.save( new Task("Task number 3", LocalDate.now().plus(3,ChronoUnit.DAYS), false) );
			taskService.save( new Task("Task number 4", LocalDate.now().plus(5,ChronoUnit.DAYS), false) );
			taskService.save( new Task("Task number 5", LocalDate.now().plus(8, ChronoUnit.DAYS), false) );
			taskService.save( new Task("Task number 6", LocalDate.now().plus(10,ChronoUnit.DAYS), false) );
			taskService.save( new Task("Task number 7", LocalDate.now().plus(12,ChronoUnit.DAYS), false) );
			taskService.save( new Task("Task number 8", LocalDate.now().plus(13,ChronoUnit.DAYS), false) );
		};
	}

}
