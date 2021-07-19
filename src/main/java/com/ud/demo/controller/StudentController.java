package com.ud.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ud.demo.model.Student;
import com.ud.demo.model.User;
import com.ud.demo.repository.StudentRepository;
import com.ud.demo.service.Student_Service;

@RestController
public class StudentController 
{
		private StudentRepository studrepo;
		private Student_Service studserv;
		public StudentController(StudentRepository studrepo, Student_Service studserv) {
			
			this.studrepo = studrepo;
			this.studserv = studserv;
		}

	    @PostMapping("/user/create")

	    public ResponseEntity<Object> createUser(@RequestBody Student user) {

	        return studserv.createUser(user);

	    }

}
