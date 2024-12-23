package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From run method in CustomCommandLineRunner class.");
		System.out.println("argument-1: "+args[0]);
		System.out.println("argument-2: "+args[1]);
		System.out.println("argument-3: "+args[2]);
	}
}
