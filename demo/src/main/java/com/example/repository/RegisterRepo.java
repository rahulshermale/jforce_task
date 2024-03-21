package com.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Login;

public interface RegisterRepo extends JpaRepository<Login, Integer>{
	
//	@Query("select * from Login" )
public default Login login(String user,int id) {
	
	
	
	
	
	return null;
	
}
	@Query(value="SELECT *  FROM login l WHERE l.username = :username",nativeQuery=true)
    Optional<Login> findByUsername(@Param("username") String username);
	
	
	
}
