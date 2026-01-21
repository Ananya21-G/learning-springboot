package com.example.demo.repository;

import com.example.demo.model.Affair;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AffairRepository extends JpaRepository<Affair, Integer> {
//yaha pe code tabhi likhenge jab customized SQL query krni ho otherwise Basic CRUD functions JpaRepository offer krta hai
}
