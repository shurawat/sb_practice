package com.learn.sb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learn.sb.entity.User;

@Repository
public interface IUserRepository extends CrudRepository<User, Integer> {

}
