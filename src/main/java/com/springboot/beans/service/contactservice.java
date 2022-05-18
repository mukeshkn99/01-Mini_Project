package com.springboot.beans.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.beans.models.contact;



@Service
public interface contactservice {
String insert(contact con);
List<contact> getallcontacts();
contact getcontacts(int cid);
String deletecontact(int cid);

}
