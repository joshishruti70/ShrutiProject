package com.example.demo.Edubridge;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.EmpModel;

public interface EmpDaoRepository extends JpaRepository<EmpModel,Integer> {

	public EmpModel findByEmail(String email);

   
	

}
