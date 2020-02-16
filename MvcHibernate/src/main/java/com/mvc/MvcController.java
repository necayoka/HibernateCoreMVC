package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.hibernate.Covek;
import com.mvc.hibernate.HibApp;

@Controller
public class MvcController {

	@RequestMapping("/")
	public String firstPage() {
		return "index.jsp";
	}
	
	@RequestMapping("dodaj")
	public String index (@RequestParam("id") int id, @RequestParam("name") String name) {
		Covek covek = new Covek();
		covek.setId(id);
		covek.setName(name);
		
		HibApp.put(covek);

		return "index.jsp";
	}
	
}
