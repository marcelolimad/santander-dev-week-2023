package me.project.service;

import me.project.domain.model.User;

public interface UserService {

    User findById (Long id);

    User create (User userToCreate);

}
