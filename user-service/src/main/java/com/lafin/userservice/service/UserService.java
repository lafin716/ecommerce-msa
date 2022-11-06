package com.lafin.userservice.service;

import com.lafin.userservice.dto.UserDto;
import com.lafin.userservice.repository.UserEntity;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto getUserByUserId(String userId);
    Iterable<UserEntity> getUserByAll();
}
