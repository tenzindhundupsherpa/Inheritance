/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.inheritance.dao;

import com.tenzin.inheritance.entity.Students;

/**
 *
 * @author Home
 */
public interface StudentsDAO {
    boolean insert(Students s);
    boolean delete(int id);
    String getById(int id);
    
}
