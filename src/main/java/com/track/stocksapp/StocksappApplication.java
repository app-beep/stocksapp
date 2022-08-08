package com.track.stocksapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class StocksappApplication {

	public static void main(String[] args) {
		SpringApplication.run(StocksappApplication.class, args);
	}

}
