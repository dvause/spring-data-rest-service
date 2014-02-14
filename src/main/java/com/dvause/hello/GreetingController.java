package com.dvause.hello;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author David Vause
 */

@RestController
public class GreetingController {
	private static final String name_tpl = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormat.forPattern("EEEE, dd MMMM, yyyy HH:mm:ss");
		String datestr = dateTime.toString(fmt);
		return new Greeting(counter.incrementAndGet(), String.format(name_tpl, name), datestr);
	}
}
