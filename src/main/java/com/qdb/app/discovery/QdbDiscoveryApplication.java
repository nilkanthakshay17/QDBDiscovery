package com.qdb.app.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QdbDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(QdbDiscoveryApplication.class, args);
		System.out.println("QDB Discovery Service Started");
	}

}
