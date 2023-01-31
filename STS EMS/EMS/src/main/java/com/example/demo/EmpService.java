package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmpService {
	@Autowired
	com.example.demo.Edubridge.EmpDaoRepository er;
	public EmpService() {
	
	}
	
	public List allEmp() {
		return er.findAll();
		
	}
	public EmpService(int id) {
		return;
	}
	public  EmpModel getId(int id) {
		
		return er.getById(id);
	}
	public void saveEmp(EmpModel e) {
		er.save(e);
	}
	public void updateEmp(EmpModel e){
		int id=e.getId();
		er.save(e);
	    String name=e.getName();
	    er.save(e);
	    
	}
	public void removeEmp(EmpModel e) {
		int id=e.getId();
		EmpModel e1=er.getOne(id);
		er.delete(e1);
		
	}
		public EmpModel getEmpById(int id) {
			Optional<EmpModel>pm=er.findById(id);//search
			if(pm.isPresent()){
				return pm.get();
			} 
			else
				return null;
			}
	
//		public boolean fetchusermailPass(EmpModel e) {
//			boolean b=false;
//			System.out.println(e.getEmail()+" "+e.getPassword());
//			
//		List<EmpModel> pm=er.findAll();
//			for(EmpModel es:pm) {
//				System.out.println(((EmpModel) pm).getEmail());
//				System.out.println(((EmpModel) pm).getPassword());
//				
//				if(e.getPassword()==e.getPassword()&& e.getEmail()==e.getEmail()) {
//					if(e.getPassword().equals(e.getPassword())&& e.getEmail().equals(e.getEmail())) {
//						b=true;
//						System.out.println(b);
//						break;
//						
//					}
//				}
//				
//			}
//			return b;
//}
//		
	}
		

	

