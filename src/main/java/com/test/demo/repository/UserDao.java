package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer>{

	public User findUserByUsername(String username);
}
