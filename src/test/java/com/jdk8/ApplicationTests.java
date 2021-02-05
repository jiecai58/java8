package com.jdk8;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.ConcurrentHashMap;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void myTest() {
		ConcurrentHashMap<String, String> name = new ConcurrentHashMap<>();
		name.put("网名","朱莉");
	}
}
