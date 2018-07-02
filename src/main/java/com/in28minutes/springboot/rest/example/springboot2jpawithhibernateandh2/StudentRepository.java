package com.in28minutes.springboot.rest.example.springboot2jpawithhibernateandh2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
