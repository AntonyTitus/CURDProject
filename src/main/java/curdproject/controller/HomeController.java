//GetMapping print a string in browser & receive a value from user and print 
package curdproject.controller;

import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import curdproject.services.StudentScrvice;

@RestController
public class HomeController {
/*	
	@GetMapping("/greet")
	public String greetMet() {
		return "Welcome";
	}
	@GetMapping("/getname/{name}")
	public String getName(@PathVariable(value = "name")String n){
		return "Hi "+n;
	}
	@GetMapping("/getname/{name}/{address}")
	public String nameAddress(@PathVariable(value = "name")String n,
								@PathVariable(value ="address")String a){
		return "Hi "+n+"You are from "+a;
	}
*/
	@Autowired
	StudentScrvice studentService;
	@PostMapping("/registrstion")
	public Registration addValue(@RequestBody Registeration regi) {
		return (Registration) this.studentService.addData(regi);
		
	}
	
}
