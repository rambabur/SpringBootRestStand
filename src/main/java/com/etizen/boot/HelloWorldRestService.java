package com.etizen.boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/MyBoot")
public class HelloWorldRestService {

	@RequestMapping(value = "/boot-customers", method = RequestMethod.GET)
	public List<String> getCustomers() {
		List<String> customers = new ArrayList<String>();
		customers.add("Ram");
		customers.add("Raj");
		customers.add("Sam");
		customers.add("Pam");
		return customers;
	}
}
