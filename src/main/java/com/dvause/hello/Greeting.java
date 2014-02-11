package com.dvause.hello;

import java.util.Date;

/**
 * @author David Vause
 */
public class Greeting {
	private final long id;
	private final String content;
	private final String date;

	public Greeting(long id, String content, String date) {
		this.id = id;
		this.content = content;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}
}
