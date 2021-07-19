package com.ud.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ud.demo.model.Student;
import com.ud.demo.model.User;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    Optional<Student> findByEmail(String email);

}
