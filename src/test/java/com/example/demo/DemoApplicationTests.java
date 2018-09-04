package com.example.demo;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.controller.HelloWorldController;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequestWithBody;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}
	 private MockMvc mvc;
	    @Before
	    public void setUp() throws Exception {
	        mvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
	    }
	    @Test
	    public void getHello() throws Exception {
	    mvc.perform(MockMvcRequestBuilders.get("/hellos").accept(MediaType.APPLICATION_JSON))
	                .andExpect(MockMvcResultMatchers.status().isOk())
	                .andDo(MockMvcResultHandlers.print())
	                .andReturn();
	    }
		private String url = "http://localhost:8080/";
		
		
		public String getdate(){
			Date date = new Date();
			String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
			return time;
		}
		
		
		@Test
		public void selectCalluses(){
			try {
					 HttpResponse<String> asString = Unirest.post(url+"helloc").asString();
					//System.out.println(jsonResponse.getBody().toString());
					System.out.println(asString.getBody().toString());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
