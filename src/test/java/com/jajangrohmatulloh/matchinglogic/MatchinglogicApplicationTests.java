package com.jajangrohmatulloh.matchinglogic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import me.xdrop.fuzzywuzzy.FuzzySearch;

@SpringBootTest
class MatchinglogicApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	void test() {

		String fullName = "Jajang Rohmatulloh";
		// List<String> users = List.of("jajang rohmatyulloh", "jajang rohmatulloh",
		// "jajang rohman");
		String fullName2 = "Jajang Rohmaaatulloh";
		int score = FuzzySearch.ratio(fullName.toLowerCase(), fullName2.toLowerCase());
		System.out.println("scoreku: " + score);
	}

}
