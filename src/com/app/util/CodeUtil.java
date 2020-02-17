package com.app.util;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CodeUtil {
	private String genstr(int length) {
		return UUID.randomUUID().toString().replace("-", "")
				.substring(0, length);

	}// genstr()

	// Methods:-
	public String getUserPwd() {
		return genstr(7);
	}

}// class
