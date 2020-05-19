package com.example.demo.batch;

import java.io.File;
import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Store;

import com.example.demo.repository.UserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class DBWriter implements ItemWriter<Store> {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void write(List<? extends Store> items) throws Exception {
		System.out.println("Data saved:="+items);
		userRepository.saveAll(items);
		
		ObjectMapper obj = new ObjectMapper();
		obj.writeValue(new File("E:/Buffer/store_buffer_1.json"),items);
		
	}

}
