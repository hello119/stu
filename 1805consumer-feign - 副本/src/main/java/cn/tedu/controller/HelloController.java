package cn.tedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.tedu.feign.EurekaServiceFeign;

@RestController
public class HelloController {
	
	//需要模板对象
	@Autowired
	private EurekaServiceFeign feign;
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		
		return feign.hello(name);
	}

}
