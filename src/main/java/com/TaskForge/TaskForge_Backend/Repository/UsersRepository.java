package com.TaskForge.TaskForge_Backend.Repository;

import com.TaskForge.TaskForge_Backend.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
