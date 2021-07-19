package com.ud.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ud.demo.model.Student;
import com.ud.demo.model.User;
import com.ud.demo.repository.ProjectRepository;
import com.ud.demo.repository.StudentRepository;

@Service
public class Student_Service
{
	private StudentRepository studentrepo;
	private ProjectRepository projectrepo;;
	
	
	public Student_Service(StudentRepository studentrepo, ProjectRepository projectrepo) {
		super();
		this.studentrepo = studentrepo;
		this.projectrepo = projectrepo;
	}


	public ResponseEntity<Object> createUser(Student student) {

        Student user = new Student();

        if (studentrepo.findByEmail(student.getEmail()).isPresent()) {

            return ResponseEntity.badRequest().body("The Email is already Present, Failed to Create new User");

        } else {

            user.setName(student.getName());

            user.setLname(student.getLname());

            user.setPhoneNumber(student.getPhoneNumber());

            user.setEmail(student.getEmail());

            user.setProj(student.getProj());


            Student savedUser = studentrepo.save(user);

            if (studentrepo.findById(savedUser.getSid()).isPresent())

                return ResponseEntity.ok("User Created Successfully");

            else return ResponseEntity.unprocessableEntity().body("Failed Creating User as Specified");

        }

    }
}
