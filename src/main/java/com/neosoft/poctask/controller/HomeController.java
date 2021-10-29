package com.neosoft.poctask.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.poctask.model.Projects;
import com.neosoft.poctask.model.Student;
import com.neosoft.poctask.service.HomeService;

@Controller

public class HomeController {
	
	@Autowired
	private HomeService hs;
	
	
	/*
	 * @GetMapping("/getAll") public List<Student>getAll() { return hs.listAll(); }
	 * 
	 * 
	 * 
	 * 
	 * @PostMapping("/save") public void save(@RequestBody Student student) {
	 * hs.save(student);
	 * 
	 * }
	 * 
	 * 
	 * 
	 * @GetMapping("/getsingle/{id}") public Student getSingle(@PathVariable int id)
	 * { return hs.get(id);
	 * 
	 * }
	 * 
	 * 
	 */

	
	  @RequestMapping("/") public String viewHomePage(Model model) { List<Student>
	  slist = hs.listAll(); model.addAttribute("slist", slist);
	  
	  return "index"; }
	  
	  @RequestMapping("/new") 
	  
	  public String showNewStudentPage(Model model) {
		  
	  Student student = new Student();
	  
	  
		 
	  model.addAttribute("student", student);
	  
	  
	  
	  return "new_student";
	  
	  
	  
	  }
	  
	  
	  @RequestMapping(value = "/save", method = RequestMethod.POST) 
	  public String saveStudent(@ModelAttribute("student") Student student ) { 
		  
		  hs.save(student);
	  
	  return "redirect:/"; }
	  
	  
	  
 @RequestMapping("/403")
public String accessDeny()
{
	return "403";
}
}