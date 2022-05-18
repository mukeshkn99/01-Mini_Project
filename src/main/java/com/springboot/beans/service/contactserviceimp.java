package com.springboot.beans.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.beans.models.contact;
import com.springboot.beans.repository.contactrepository;



@Service
public class contactserviceimp implements contactservice {

	@Autowired
	private contactrepository repo;
	@Override
	public String insert(contact con) {
		con.setSwitchact("y");
	repo.save(con);
		return "success";
	}

	@Override
	public List<contact> getallcontacts( ) {
		return repo.findAll();
	}

	@Override
	public contact getcontacts(int cid) {
		Optional<contact> find=repo.findById(cid);
		if(find.isPresent()) {
         return find.get();
		}
		return null;
	}

	@Override
	public String deletecontact(int cid) {
		//repo.deleteById(cid);
		Optional<contact> find=repo.findById(cid);
		if(find.isPresent()) {
		contact cont=find.get();
		cont.setSwitchact("N");
		repo.save(cont);
		}
		
		return "success";
	}

}
