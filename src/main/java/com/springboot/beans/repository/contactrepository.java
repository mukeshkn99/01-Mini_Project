package com.springboot.beans.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.beans.models.contact;

@Repository
public interface contactrepository extends JpaRepository<contact,Integer>{

}
