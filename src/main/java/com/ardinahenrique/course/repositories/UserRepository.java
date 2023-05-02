package com.ardinahenrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ardinahenrique.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
