package com.gabrielxavier.course.repositories;

import com.gabrielxavier.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
