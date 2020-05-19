package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBatchExample1Application {

	
	
	public static void main(String[] args)  {
		SpringApplication.run(SpringBatchExample1Application.class, args);
		
		
		System.out.println("Shouvik is here");
		
		  
//		try {
//			new SpringBatchExample1Application().load();
//		} catch (JobExecutionAlreadyRunningException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JobRestartException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JobInstanceAlreadyCompleteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JobParametersInvalidException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		

	}
	
	//@PostConstruct
	


}
