package com.example.demo.repository;

import com.example.demo.model.Associate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociateRepo extends JpaRepository<Associate,Integer> {
}
