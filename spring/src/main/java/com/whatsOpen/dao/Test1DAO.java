package com.whatsOpen.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whatsOpen.model.Test1;

@Repository
public interface Test1DAO extends JpaRepository<Test1, Integer>{

}
