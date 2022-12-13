package com.example.RestAPI2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControllerApi {

	@GetMapping("/getdataapi")
	public String getdata() {
		System.out.println("Get API triggered");
		return ("Get Api sent data back");
	}
	
	@PostMapping("/postdata")
	public String postdata(@RequestBody EntityPerson entityPerson) {
		System.out.println("Post API triggered" + entityPerson.getFullname());
		return ("POST Api sent data back");
	}

}
