package com.aaron.service;

/**
 * Created by Aaron Sheng on 10/6/16.
 */
public interface UserService {
    String getName(Long id);

    void setName(Long id, String name);
}
