package com.ud.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ud.demo.model.Project;
import com.ud.demo.model.Role;
import com.ud.demo.repository.ProjectRepository;
import com.ud.demo.repository.RoleRepository;

@Service
public class Project_Service 
{

    private ProjectRepository projectRepository;


    public Project_Service(ProjectRepository projectRepository) {

        this.projectRepository = projectRepository;

    }



    /** Create a new role  */

    public ResponseEntity<Object> addRole(Project project)  {


        Project newproj = new Project();

        newproj.setProj_name(project.getProj_name());
        newproj.setProjid(project.getProjid());

        newproj.setProj_duration(project.getProj_duration());

        Project savedproj= projectRepository.save(newproj);

        if(projectRepository.findById(savedproj.getProjid()).isPresent()) {

            return ResponseEntity.accepted().body("Successfully Created Role ");

        } else

            return ResponseEntity.unprocessableEntity().body("Failed to Create specified Role");

    }
		
}
