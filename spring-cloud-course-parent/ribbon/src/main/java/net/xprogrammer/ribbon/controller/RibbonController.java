package net.xprogrammer.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.xprogrammer.ribbon.service.RibbonService;

@RestController
public class RibbonController {
	@Autowired
	RibbonService ribbonService;
	
	@RequestMapping("/hi")
	public String sayHi(@RequestParam String name) {
		return ribbonService.sayHi(name);
	}

}
