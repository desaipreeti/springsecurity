package com.neosoft.poctask.service;

import java.util.List;

import com.neosoft.poctask.model.Student;

public interface HomeService {
	
	public List<Student> listAll();
        
    public void save(Student student);
     
    public Student get(int id);

}
