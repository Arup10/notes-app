package com.esc.practice.apps.notes;

import java.util.Arrays;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = { "com.esc.practice.apps.notes.web", "com.esc.practice.apps.notes.service",
		"com.esc.practice.apps.notes.service.*", "com.esc.practice.apps.notes.dao",
		"com.esc.practice.apps.notes.dao.*" })
public class NotesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesAppApplication.class, args);
	}

	@Bean
	public DozerBeanMapper createDozerBean() {
		DozerBeanMapper dozer = new DozerBeanMapper();
		dozer.setMappingFiles(Arrays.asList("dozerBeanMapping.xml"));
		return dozer;
	}
}
