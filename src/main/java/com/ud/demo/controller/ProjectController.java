package com.ud.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ud.demo.model.Project;
import com.ud.demo.model.Role;
import com.ud.demo.repository.ProjectRepository;
import com.ud.demo.repository.RoleRepository;
import com.ud.demo.service.Project_Service;
import com.ud.demo.service.RoleService;

@RestController
public class ProjectController 
{
	
	private ProjectRepository projrepo;
	private Project_Service projserv;



    public ProjectController(Project_Service projserv, ProjectRepository projrepo) {

        this.projserv = projserv;

        this.projrepo = projrepo;

    }
    @PostMapping("/project/create")
    public ResponseEntity<Object> createRole(@RequestBody Project project) {

        return  projserv.addRole(project);

    }

}
