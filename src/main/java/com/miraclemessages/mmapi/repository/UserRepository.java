package com.miraclemessages.mmapi.repository;

import com.miraclemessages.mmapi.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}
