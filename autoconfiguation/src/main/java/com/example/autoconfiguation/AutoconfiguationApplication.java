package com.example.autoconfiguation;

import com.example.autoconfiguation.autoconfig.SpringBootCourse;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
@RequiredArgsConstructor
public class AutoconfiguationApplication implements CommandLineRunner {

	private final WebApplicationContext context;


	public static void main(String[] args) {
		SpringApplication.run(AutoconfiguationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SpringBootCourse springBootCourse = context.getBean(SpringBootCourse.class);
		springBootCourse.showSpringBootCourseDetails();
	}
}
