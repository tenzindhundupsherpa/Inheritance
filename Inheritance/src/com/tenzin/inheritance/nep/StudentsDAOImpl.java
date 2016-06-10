/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.inheritance.nep;

import com.tenzin.inheritance.dao.StudentsDAO;
import com.tenzin.inheritance.entity.Students;

/**
 *
 * @author Home
 */
public class StudentsDAOImpl implements StudentsDAO{

    @Override
    public boolean insert(Students s) {
        System.out.println("Hello There");
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
