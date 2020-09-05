package com.example.springcache.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.example.springcache.domain.Student;

@Service
public class StudentService {
	@Cacheable("student")
	public Student getStudentByID(String id) {
		try {
			System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Student(id,"Sajal" ,"V");
		
	}
}
