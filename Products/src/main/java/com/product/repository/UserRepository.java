package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);

	@Query("select e from user e where e.emailid=:emailid")
	User findByEmailid(@Param("emailid")String emailid);

}
