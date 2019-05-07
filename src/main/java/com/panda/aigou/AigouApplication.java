package com.panda.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AigouApplication {

	public static void main(String[] args) {
		SpringApplication.run(AigouApplication.class, args);
	}

}
