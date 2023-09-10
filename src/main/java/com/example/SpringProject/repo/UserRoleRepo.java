package com.example.SpringProject.repo;

import com.example.SpringProject.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.web.servlet.oauth2.resourceserver.OpaqueTokenDsl;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface UserRoleRepo extends JpaRepository<UserRole,String> {

public Optional<UserRole> findByRoleName(String name);

}
