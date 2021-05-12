package com.sedatbsp.ozguryazilim.repository;

import com.sedatbsp.ozguryazilim.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);

}
