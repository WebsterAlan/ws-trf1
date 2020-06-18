package com.gov.trf.ws.ctrl;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.gov.trf.ws.entity.Search;

@RestController
@RequestMapping("/search")
public class Researches {

	@Autowired
	RestTemplate restTemplate;
	
	private static String url = "https://viacep.com.br/ws/";
	
	   @RequestMapping(value = "/{cep}", method = RequestMethod.GET,produces = { "application/json"})
	   public Object updateProduct(@PathVariable("cep") Integer cep) {
	      return restTemplate.getForObject(this.url + cep +"/json",Search.class);
	   }
	   
	   
	
	
	
	
}
