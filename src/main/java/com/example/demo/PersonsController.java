package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonsController {
	@Autowired
     PersonsRepo repo;
	@RequestMapping("/")
	public String showHomepage() {
		return "Homepage";
	}
	
    @RequestMapping("/add-person")
	public String SubmissionForm() {
		return "SubmissionForm";
	}
    
    @RequestMapping("/submit-details")
    public String submitDetails(Persons persons) {
    	repo.save(persons);
		return "SubmissionForm";
	}
    
    
    @RequestMapping("/search")
    public String search() {
    	return "searchPersons";
    }
    
    @GetMapping("/get-details")
    public String getDetails(HttpServletRequest request) {
		request.setAttribute("persons",getPersons());
    	return "viewPersons";
	}
    
    @GetMapping("/completed")
    public String getCompletedPersons(HttpServletRequest request) {
		request.setAttribute("persons",getPersons());
    	return "showCompleted";
	}
    
    @PostMapping("/get-details")
    public ModelAndView getdetails(@RequestParam int pid) {
    	ModelAndView mv=new ModelAndView("Retrieve");
    	Persons persons=repo.findById(pid).orElse(null);
        mv.addObject(persons);
        return mv;
    }
    
    @RequestMapping("/persons")
    @ResponseBody
    public List<Persons> getPersons() {
    	return repo.findAll();
    }
    
    @RequestMapping("/persons/{pid}")
    @ResponseBody
    public Optional<Persons> getPersonById(@PathVariable("pid") int pid) {
    	return repo.findById(pid);
    }
    
    @PostMapping("/persons")
    public Persons addPerson(@RequestBody Persons persons) {
    	repo.save(persons);
    	return persons;
    }
    
    @RequestMapping("/delete-persons")
    public String deletePerson(@RequestParam int pid,@RequestParam int type,HttpServletRequest request) {
    	repo.deleteById(pid);
    	request.setAttribute("persons", getPersons());
    	if(type==1)
    	return "viewPersons";
    	else
    	return "showCompleted";
    }
}
