package com.skeiatate.repository;

import com.skeiatate.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author SkeiATate
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
