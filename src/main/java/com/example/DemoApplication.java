package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import scala.Array;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		Map map=new HashMap<String,String>();
		map.put(1, 1);
		map.put(new Date(),"");
		
		String[] ss={};
		
		SpringApplication.run(DemoApplication.class, args);
	}
}