package com.miraclemessages.mmapi.services;

import com.miraclemessages.mmapi.models.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    List<User> findAll(Pageable pageable);

    User findUserById(long id);

    void delete(long id);

    User save(User user);

    User update(User user, long id);
}