package com.example.demo.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.demo.model.Store;


@Component
public class Processor implements ItemProcessor<Store, Store> {

	private static final Map<String,String> DEPT_NAMES=new HashMap<>();
	public Processor() {
		DEPT_NAMES.put("001", "Cleaning");
		DEPT_NAMES.put("002", "Accesories");
		DEPT_NAMES.put("003", "Food");
	}
	@Override
	public Store process(Store item) throws Exception {
		String itemCatagoryCode = item.getItemCatagory();
		String itemCatagory = DEPT_NAMES.get(itemCatagoryCode);
		item.setItemCatagory(itemCatagory);
		System.out.println(String.format("Converted from [%s] to [%s]",itemCatagoryCode,itemCatagory));
		return item;
	}

}
