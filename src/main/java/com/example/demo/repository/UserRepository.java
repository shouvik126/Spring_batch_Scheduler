package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Store;


public interface UserRepository extends JpaRepository<Store, Integer> {

}
