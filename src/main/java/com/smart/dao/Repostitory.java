package com.smart.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import com.smart.enties.User;

public interface Repostitory extends JpaRepository<User,Integer> {

}
