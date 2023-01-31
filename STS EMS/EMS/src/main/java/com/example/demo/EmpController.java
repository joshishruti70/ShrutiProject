package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Edubridge.EmpDaoRepository;
@Configuration
@ComponentScan(basePackages= {"com.example.demo.Edubridge"})
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class EmpController {
	@Autowired
	EmpService es;
	@Autowired
	EmpDaoRepository er;
	@GetMapping("employee")
	public List<EmpModel> getAll(){
		System.out.println("Hello");
		return es.allEmp();
	}
	@RequestMapping("/employee/{id1}")
	public void getEmpById(@PathVariable("id1")int id) {
		System.out.println("I am Controller********");
		this.es.getId(id);
	}
	
	

	
	@PostMapping("save")
	public void addEmp(@RequestBody EmpModel e) {
		System.out.println("I am in controller class********");
		this.es.saveEmp(e);
		
	}
	@PutMapping("update")
	public void updateEmp(@RequestBody EmpModel e) {
		this.es.updateEmp(e);
}
	
	
//	
//	@RequestMapping(value="/employee/{id}/{name}/{surname}/{dob}/{gender}/{mstatus}/{doj}/{designation}", method = RequestMethod.PUT)
//	public void getUser(@PathVariable String id, @RequestBody EmpModel e) {
//
//	    this.es.updateEmp(e);
//
//	}
//	
	
	@PostMapping("delete")
	public void deleteEmp(@RequestBody EmpModel e) {
		this.es.removeEmp(e);
	}
		
		@PostMapping("view")//view1/search id
		public EmpModel getEmpById(@RequestBody EmpModel id){
			int id1=id.getId();
		return es.getEmpById(id1);
		}
	
//	@PostMapping("login")
//	public boolean loginUser(@RequestBody EmpModel e) {
//		System.out.println("I am in controller........");
//		boolean b=es.fetchusermailPass(e);
//		System.out.println(b);
//	return b;
//		
//	}
		
		
//	@PostMapping("register")
//	public void addEmp2(@RequestBody EmpModel e) {
//		System.out.println("I am in controller class********");
//		this.es.saveEmp(e);
//}

@PostMapping("login")
	 ResponseEntity<?> userLogin(@RequestBody EmpModel userData){
		EmpModel user=er.findByEmail(userData.getEmail());
		System.out.println(user);
		if(user.getPassword().equals(userData.getPassword())) {
			return ResponseEntity.ok(user);
		}
		return (ResponseEntity<?>)ResponseEntity.internalServerError();
	}
	
}

