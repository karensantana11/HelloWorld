package helloworldgeneration.Projeto.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class helloworldcontroller {

	@GetMapping
	public String HelloWorld() {
		return "Hello World!!!";

	}

}
