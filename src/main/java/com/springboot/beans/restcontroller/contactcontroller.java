package com.springboot.beans.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.beans.models.contact;
import com.springboot.beans.service.contactservice;

@Controller
public class contactcontroller {

	@Autowired
	private contactservice service;
	
	@PostMapping("/createcontact")
	public ResponseEntity<String> savecontact(@RequestBody contact con){
		String save=service.insert(con);
		return new ResponseEntity<>(save,HttpStatus.CREATED);
	}
	
	@GetMapping("/getallcontacts")
	public ResponseEntity<List<contact>> getall(){
		List<contact> get=service.getallcontacts();
		return new ResponseEntity<>(get,HttpStatus.OK);
		
	}
	
	@GetMapping("/getcontact/{cid}")
	public ResponseEntity<contact> getcontact(@PathVariable("cid") int cid) {
		contact view=service.getcontacts(cid);
		return new ResponseEntity<>(view,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletecontact/{cid}")
	public ResponseEntity deleteid(@PathVariable("cid")int cid) {
		String delete=service.deletecontact(cid);
		return new ResponseEntity<>(delete,HttpStatus.OK);
	}
	
}
