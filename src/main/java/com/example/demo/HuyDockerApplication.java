package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HuyDockerApplication {



	@RequestMapping("/hello")
	public String helloDocker() {
		return "<html>\n"+
				"<header><title>Welcome HUY</title></header>\n" +
				"<body>\n" +
				"<h3>Hello world HUY</h3>" +




				"</body>" +


				"</html>";
	}

	public static void main(String[] args) {
		SpringApplication.run(HuyDockerApplication.class, args);
	}

}
