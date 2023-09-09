package com.example.SpringProject.repo;

import com.example.SpringProject.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long>  {


 /*   @Query(value = "SELECT * FROM customer WHERE public_id=?",nativeQuery = true)*/
public Optional<Customer> findByPublicId(long id);

public void deleteByPublicId(long id);


}


