//package com.example.demo;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.example.demo.Edubridge.RegisterRepository;
//
//public class RegisterController {
//	
//	RegisterService rs;
//	@PostMapping("save")
//	public void addEmp(@RequestBody RegisterModel r) {
//		this.rs.saveEmp(r);
//		System.out.println("Saved successfully !!!");
//	}
//	@GetMapping("view")
//	public List<RegisterModel> AllData(){
//		return this.rs.allEmp();
//	}
//	@Autowired
//	RegisterRepository rr;
//	@PostMapping("login")
//	ResponseEntity<?>userLogin(@RequestBody RegisterModel userData){
//		RegisterModel user=rr.findByEmail(userData.getEmail());
//		System.out.println(user);
//		if(user.getPassword().equals(userData.getPassword())) {
//		return ResponseEntity.ok(user);
//	}
//	return (ResponseEntity<?>)ResponseEntity.internalServerError();
//	}
//
//}
