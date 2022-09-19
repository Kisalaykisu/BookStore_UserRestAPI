package com.example.bookstore_userrestapi.repository;

import com.example.bookstore_userrestapi.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserDetails, Long> {
    @Query(value = "SELECT * FROM user WHERE email=:email", nativeQuery = true)
    UserDetails findByEmailAddress(String email);
}
