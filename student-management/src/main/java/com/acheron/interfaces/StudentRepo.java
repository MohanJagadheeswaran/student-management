package com.acheron.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acheron.repo.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
