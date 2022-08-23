package com.eauction.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EAuctionConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EAuctionConfigServerApplication.class, args);
	}

}
