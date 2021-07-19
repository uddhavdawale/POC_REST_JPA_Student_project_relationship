package com.ud.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ud.demo.model.Project;
import com.ud.demo.model.Role;
@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {

    //Optional<Role> findByProj_name(String name);


}
