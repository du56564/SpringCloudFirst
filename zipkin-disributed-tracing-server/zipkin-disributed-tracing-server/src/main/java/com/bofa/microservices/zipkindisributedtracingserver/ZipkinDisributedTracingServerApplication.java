package com.bofa.microservices.zipkindisributedtracingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinDisributedTracingServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZipkinDisributedTracingServerApplication.class, args);
	}

}
