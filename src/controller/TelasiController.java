package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelasiController {

	@GetMapping("/telasi")
	public String telasi() {
		return "telasi";
	}
}
	