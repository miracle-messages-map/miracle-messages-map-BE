package com.miraclemessages.mmapi.repository;

import com.miraclemessages.mmapi.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long>
{
    User findByUsername(String username);
}
