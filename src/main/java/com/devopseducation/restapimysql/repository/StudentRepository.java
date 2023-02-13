package com.devopseducation.restapimysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.devopseducation.restapimysql.model.Students;

public interface StudentRepository extends CrudRepository<Students, Integer> {

}
