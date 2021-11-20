package com.bridgelabz.userapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.userapplication.model.User;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {

}
