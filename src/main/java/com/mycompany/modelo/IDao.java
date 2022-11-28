/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modelo;

import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IDao {
    String save(UserDto u);
    String update(UserDto u);
    String delete(String id);
    UserDto getById(String id);
    List<UserDto> getAll();
}
