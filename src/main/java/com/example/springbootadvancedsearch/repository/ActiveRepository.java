package com.example.springbootadvancedsearch.repository;

import com.example.springbootadvancedsearch.model.Active;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiveRepository extends JpaRepository<Active, Long>, JpaSpecificationExecutor<Active> {
}
